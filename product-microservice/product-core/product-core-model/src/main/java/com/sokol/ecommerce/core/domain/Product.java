package com.sokol.ecommerce.core.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;

@Builder
@Getter
public class Product {

    private String id;

    private long version;

    private long price;

    private String name;

    private boolean enabled;

    private int quantity;

    private Instant createdAt;

}
