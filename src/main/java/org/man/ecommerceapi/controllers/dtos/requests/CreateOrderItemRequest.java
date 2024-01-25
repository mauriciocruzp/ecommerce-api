package org.man.ecommerceapi.controllers.dtos.requests;

import lombok.Getter;
import jakarta.validation.constraints.NotNull;

@Getter
public class CreateOrderItemRequest {
    @NotNull
    private Integer quantity;

    @NotNull
    private Long productId;
}
