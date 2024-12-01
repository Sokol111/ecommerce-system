package com.sokol.ecommerce.core.handler;

import com.sokol.ecommerce.core.domain.Product;
import com.sokol.ecommerce.core.dto.CreateProductDto;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.UUID;

@Component
public class ProductHandler {

    public Product create(CreateProductDto dto) {
        return Product.builder()
            .id(UUID.randomUUID().toString())
            .createdAt(Instant.now())
            .version(1)
            .enabled(false)
            .price(dto.getPrice())
            .quantity(dto.getQuantity())
            .name(dto.getName())
            .build();
    }

}
