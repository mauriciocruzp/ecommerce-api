package org.man.ecommerceapi.controllers.dtos.requests;

import lombok.Getter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Getter
public class CreateOrderStatusRequest {
    @NotNull
    private Long id;

    @NotBlank
    private String name;
}
