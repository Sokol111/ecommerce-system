package com.sokol.ecommerce.core.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CreateProductDto {

    private long price;

    private String name;

    private int quantity;

}
