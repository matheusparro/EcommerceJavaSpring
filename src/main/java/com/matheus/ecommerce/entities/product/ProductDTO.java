package com.matheus.ecommerce.entities.product;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductDTO {

    private Long id;

    @Size(min = 3, max = 80, message = "Name must be between 3 and 100 characters")
    @NotBlank(message = "Name is required")
    private String name;

    @Positive(message = "Price must be a positive value")
    private Double price;

    @Size(min = 10, message = "Description must be at least 10 characters")
    @NotBlank(message = "Description is required")
    private String description;

    private String imgUrl;

    public ProductDTO(Product entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.price = entity.getPrice();
        this.description = entity.getDescription();
        this.imgUrl = entity.getImgUrl();
    }

}
