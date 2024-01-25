package org.man.ecommerceapi.services.interfaces;

import org.man.ecommerceapi.controllers.dtos.responses.BaseResponse;
import org.man.ecommerceapi.entities.Category;
import org.man.ecommerceapi.entities.Product;
import org.man.ecommerceapi.entities.pivots.ProductCategory;

public interface IProductCategoryService {
    ProductCategory create(Product product, Category category);

    BaseResponse listAllProductsByCategoryName(String categoryName);

    BaseResponse listAllCategoriesByProductId(Long productId);
}
