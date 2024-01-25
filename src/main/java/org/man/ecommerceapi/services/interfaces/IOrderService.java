package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.requests.UpdateOrderRequest;
import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.man.ecommerceapi.entities.Order;

public interface IOrderService {
    BaseResponse list();

    BaseResponse create();

    BaseResponse get(Long id);

    BaseResponse update(Long id, UpdateOrderRequest request);

    BaseResponse delete(Long id);

    BaseResponse getOrderByUserId(Long id);

    Order findOneAndEnsureExistById(Long id);

    Order findOneAndEnsureExistByOrderStatus_NameAndUser_Id(String name, Long userId);

    BaseResponse getDeliveredAndInProgressOrderByUserId(Long userId);

    Order findOneByUserIdOrCreate(Long id);
}
