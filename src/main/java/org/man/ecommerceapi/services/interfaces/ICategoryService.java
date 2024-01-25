package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.requests.CreateCategoryRequest;
import org.man.ecommerceapi.controllers.dtos.requests.UpdateCategoryRequest;
import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.man.ecommerceapi.entities.Category;

public interface ICategoryService {
    BaseResponse list();

    BaseResponse get(Long id);

    BaseResponse create(CreateCategoryRequest request);

    BaseResponse update(Long id, UpdateCategoryRequest request);

    BaseResponse delete(Long id);

    Category findOneAndEnsureExistById(Long id);

    Category findOneAndEnsureExistByName(String name);
}
