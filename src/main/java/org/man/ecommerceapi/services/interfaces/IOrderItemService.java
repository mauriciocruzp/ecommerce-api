package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.requests.CreateOrderItemRequest;
import org.man.ecommerceapi.controllers.dtos.requests.UpdateOrderItemRequest;
import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;

public interface IOrderItemService {
    BaseResponse create(CreateOrderItemRequest request);

    BaseResponse get(Long id);

    BaseResponse update(Long id, UpdateOrderItemRequest request);

    BaseResponse delete(Long id);
}
