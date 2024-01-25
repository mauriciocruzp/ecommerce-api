package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.man.ecommerceapi.entities.ProductStatus;

public interface IProductStatusService {
    BaseResponse list();

    ProductStatus findOneAndEnsureExistById(Long id);
}
