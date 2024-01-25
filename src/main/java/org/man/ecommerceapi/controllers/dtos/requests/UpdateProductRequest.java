package org.man.ecommerceapi.controllers.dtos.requests;

import lombok.Getter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Getter
public class UpdateProductRequest {
    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    private String imageUrl;

    @NotNull
    private Integer stock;

    @NotNull
    private Float price;

    @NotNull
    private Long productStatusId;

    @NotNull
    private List<@NotNull Long> categoryIds;
}
