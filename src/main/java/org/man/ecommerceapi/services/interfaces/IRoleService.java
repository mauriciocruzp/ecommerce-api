package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.man.ecommerceapi.entities.Role;

public interface IRoleService {
    BaseResponse list();

    Role findOneAndEnsureExistById(Long id);

    Role findOneAndEnsureExistByName(String name);
}
