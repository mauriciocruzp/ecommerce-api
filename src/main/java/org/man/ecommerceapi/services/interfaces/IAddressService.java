package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.requests.CreateAddressRequest;
import org.man.ecommerceapi.controllers.dtos.requests.UpdateAddressRequest;
import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.man.ecommerceapi.entities.Address;

public interface IAddressService {
    BaseResponse create(CreateAddressRequest request);

    BaseResponse get(Long id);

    BaseResponse list(Long userId);

    BaseResponse update(Long id, UpdateAddressRequest request);

    BaseResponse delete(Long id);

    Address findOneAndEnsureExistById(Long id);
}
