package org.man.ecommerceapi.controllers.dtos.requests;

import lombok.Getter;
import jakarta.validation.constraints.NotNull;

@Getter
public class UpdateOrderRequest {
    @NotNull
    private Long orderStatusId;
}
