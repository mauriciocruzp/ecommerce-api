package org.man.ecommerceapi.entities.projections;

import org.man.ecommerceapi.entities.pivots.ProductCategory;

import java.util.List;

public interface CategoryProjection {
    Long getId();

    String getName();

    List<ProductCategory> getProductCategories();
}
