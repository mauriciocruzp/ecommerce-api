package org.man.ecommerceapi.repositories;

import org.man.ecommerceapi.entities.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IOrderStatusRepository extends JpaRepository<OrderStatus, Long> {
    Optional<OrderStatus> findByName(String name);

    boolean existsByName(String name);
}
