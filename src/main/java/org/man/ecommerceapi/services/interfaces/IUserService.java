package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.requests.CreateUserRequest;
import org.man.ecommerceapi.controllers.dtos.requests.UpdateUserRequest;
import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.man.ecommerceapi.entities.User;

public interface IUserService {
    BaseResponse create(CreateUserRequest request);

    BaseResponse get(Long id);

    BaseResponse update(UpdateUserRequest request, Long id);

    BaseResponse delete(Long id);

    User findOneAndEnsureExistById(Long id);
}
