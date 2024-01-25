package org.man.ecommerceapi.repositories;

import org.man.ecommerceapi.entities.ProductStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProductStatusRepository extends JpaRepository<ProductStatus, Long> {
    Optional<ProductStatus> findByName(String name);

    boolean existsByName(String name);
}
