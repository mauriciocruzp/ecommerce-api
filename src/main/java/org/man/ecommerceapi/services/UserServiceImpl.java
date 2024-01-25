package org.man.ecommerceapi.services;

import org.man.ecommerceapi.controllers.dtos.requests.CreateUserRequest;
import org.man.ecommerceapi.controllers.dtos.requests.UpdateUserRequest;
import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.man.ecommerceapi.controllers.dtos.responses.UserResponse;
import org.man.ecommerceapi.controllers.exceptions.ObjectNotFoundException;
import org.man.ecommerceapi.controllers.exceptions.UniqueConstraintViolationException;
import org.man.ecommerceapi.entities.Role;
import org.man.ecommerceapi.entities.User;
import org.man.ecommerceapi.entities.pivots.UserRole;
import org.man.ecommerceapi.repositories.IUserRepository;
import org.man.ecommerceapi.services.interfaces.IRoleService;
import org.man.ecommerceapi.services.interfaces.IUserRoleService;
import org.man.ecommerceapi.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository repository;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IUserRoleService userRoleService;

    @Override
    public BaseResponse get(Long id) {
        User user = findOneAndEnsureExistById(id);

        return BaseResponse.builder()
                .data(from(user))
                .message("User found")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.OK)
                .build();
    }

    @Override
    public BaseResponse create(CreateUserRequest request) {

        if (repository.existsByEmail(request.getEmail()))
            throw new UniqueConstraintViolationException("Email is already in use");

        User user = repository.save(from(request));

        Role defaultRole = roleService.findOneAndEnsureExistByName("ROLE_USER");

        user = addRoleToUser(defaultRole, user);

        return BaseResponse.builder()
                .data(from(user))
                .message("User created correctly")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.CREATED)
                .build();
    }

    @Override
    public BaseResponse update(UpdateUserRequest request, Long id) {
        User user = from(request);

        user = update(user, request);

        return BaseResponse.builder()
                .data(from(user))
                .message("User updated correctly")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.OK)
                .build();
    }

    @Override
    public BaseResponse delete(Long id) {
        repository.deleteById(id);

        return BaseResponse.builder()
                .data(Collections.EMPTY_LIST)
                .message("User deleted correctly")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.NO_CONTENT)
                .build();
    }

    @Override
    public User findOneAndEnsureExistById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

    private User from(UpdateUserRequest request) {
        return getUser(request.getEmail(), request.getFirstName(), request.getLastName(), request.getPassword());
    }

    private User getUser(String email, String firstName, String lastName, String password) {
        User user = new User();
        user.setEmail(email);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(encodePassword(password));

        return user;
    }

    private User addRoleToUser(Role defaultRole, User user) {
        UserRole userRole = userRoleService.create(user, defaultRole);

        List<UserRole> userRoleList = new ArrayList<>();
        userRoleList.add(userRole);

        user.setUserRoles(userRoleList);

        user = repository.save(user);

        return user;
    }

    private User update(User user, UpdateUserRequest request) {
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPassword(encodePassword(request.getPassword()));

        repository.save(user);

        return user;
    }

    private User from(CreateUserRequest request) {
        return getUser(request.getEmail(), request.getFirstName(), request.getLastName(), request.getPassword());
    }

    private static String encodePassword(String request) {
        return new BCryptPasswordEncoder().encode(request);
    }

    private UserResponse from(User user) {
        UserResponse userResponse = new UserResponse();

        userResponse.setId(user.getId());
        userResponse.setEmail(user.getEmail());
        userResponse.setFirstName(user.getFirstName());
        userResponse.setLastName(user.getLastName());

        return userResponse;
    }
}
