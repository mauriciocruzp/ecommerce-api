package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.man.ecommerceapi.entities.OrderStatus;

public interface IOrderStatusService {
    BaseResponse list();

    OrderStatus findOneAndEnsureExistById(Long id);

    OrderStatus findOneAndEnsureExistByName(String name);
}
