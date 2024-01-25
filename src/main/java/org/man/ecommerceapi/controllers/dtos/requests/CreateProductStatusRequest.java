package org.man.ecommerceapi.controllers.dtos.requests;

import lombok.Getter;
import jakarta.validation.constraints.NotBlank;

@Getter
public class CreateProductStatusRequest {
    @NotBlank
    private String name;
}
