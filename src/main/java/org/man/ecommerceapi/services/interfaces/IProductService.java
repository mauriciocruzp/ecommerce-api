package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.requests.CreateProductRequest;
import org.man.ecommerceapi.controllers.dtos.requests.UpdateProductRequest;
import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.man.ecommerceapi.entities.Product;

public interface IProductService {
    BaseResponse get(Long id);

    BaseResponse list(String keyword);

    BaseResponse create(CreateProductRequest request);

    BaseResponse update(Long id, UpdateProductRequest request);

    Product findOneAndEnsureExists(Long id);

    void updateStock(Product product, Integer newStock);
}
