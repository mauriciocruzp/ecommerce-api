package org.man.ecommerceapi.controllers.dtos.requests;

import lombok.Getter;
import jakarta.validation.constraints.NotNull;

@Getter
public class UpdateOrderItemRequest {
    @NotNull
    private Integer quantity;
}
