package com.sokol.ecommerce.rest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ProductResponse {

    private String id;

    private long price;

    private String name;

    private int quantity;

    private long version;

}
