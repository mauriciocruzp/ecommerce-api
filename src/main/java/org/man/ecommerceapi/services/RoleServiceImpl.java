package org.man.ecommerceapi.services;

import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.man.ecommerceapi.controllers.exceptions.ObjectNotFoundException;
import org.man.ecommerceapi.entities.Role;
import org.man.ecommerceapi.repositories.IRoleRepository;
import org.man.ecommerceapi.services.interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleRepository repository;

    @Override
    public BaseResponse list() {
        List<Role> roles = repository.findAll();

        return BaseResponse.builder()
                .data(roles)
                .message("Roles found correctly")
                .success(Boolean.TRUE)
                .httpStatus(HttpStatus.OK).build();
    }

    @Override
    public Role findOneAndEnsureExistById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("User Role not found"));
    }

    @Override
    public Role findOneAndEnsureExistByName(String name) {
        return repository.findByName(name).orElseThrow(() -> new ObjectNotFoundException("User Role not found"));
    }
}
