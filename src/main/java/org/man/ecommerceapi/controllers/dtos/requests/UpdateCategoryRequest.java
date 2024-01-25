package org.man.ecommerceapi.controllers.dtos.requests;

import lombok.Getter;
import jakarta.validation.constraints.NotBlank;

@Getter
public class UpdateCategoryRequest {
    @NotBlank
    private String name;
}
