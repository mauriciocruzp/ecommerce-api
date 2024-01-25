package org.man.ecommerceapi.controllers.dtos.requests;

import lombok.Getter;
import jakarta.validation.constraints.NotBlank;

@Getter
public class CreateAddressRequest {
    @NotBlank
    private String street;

    @NotBlank
    private String zipcode;

    @NotBlank
    private String state;

    @NotBlank
    private String country;
}
