package org.man.ecommerceapi.controllers.dtos.requests;

import lombok.Getter;
import jakarta.validation.constraints.NotBlank;

@Getter
public class CreateCategoryRequest {
    @NotBlank
    private String name;
}
