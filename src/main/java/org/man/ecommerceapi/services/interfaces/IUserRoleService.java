package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.man.ecommerceapi.entities.Role;
import org.man.ecommerceapi.entities.User;
import org.man.ecommerceapi.entities.pivots.UserRole;

import java.util.List;

public interface IUserRoleService {
    BaseResponse listAllUsersByRoleId(Long id);

    BaseResponse listAllRolesByUserId(Long id);

    List<Role> getAllRolesByUserId(Long id);

    UserRole create(User user, Role role);
}
