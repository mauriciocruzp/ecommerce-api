package org.man.ecommerceapi.repositories;

import org.man.ecommerceapi.entities.pivots.ProductCategory;
import org.man.ecommerceapi.entities.projections.CategoryProjection;
import org.man.ecommerceapi.entities.projections.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
    @Query(value = "select products.*  from products_categories " +
            "inner join products on products_categories.product_id = products.id " +
            "inner join categories on products_categories.category_id = categories.id " +
            "where categories.name = :categoryName", nativeQuery = true)
    List<ProductProjection> listAllProductsByCategoryName(String categoryName);

    @Query(value = "select categories.* from products_categories " +
            "inner join categories on products_categories.category_id = categories.id " +
            "inner join products on products_categories.product_id = products.id " +
            "where products_categories.product_id = :productId", nativeQuery = true)
    List<CategoryProjection> listAllCategoriesByProductId(Long productId);

    boolean existsByProductIdAndCategoryId(Long productId, Long categoryId);

    ProductCategory findByProductIdAndCategoryId(Long productId, Long categoryId);
}
