package com.sokol.ecommerce.rest.mapper;

import com.sokol.ecommerce.core.domain.Product;
import com.sokol.ecommerce.core.dto.CreateProductDto;
import com.sokol.ecommerce.rest.dto.CreateProductRequest;
import com.sokol.ecommerce.rest.dto.ProductResponse;
import org.springframework.stereotype.Component;

@Component
public class RestProductMapper {

    public CreateProductDto map(CreateProductRequest request) {
        return CreateProductDto.builder()
            .name(request.getName())
            .price(request.getPrice())
            .quantity(request.getQuantity())
            .build();
    }

    public ProductResponse map(Product product) {
        return ProductResponse.builder()
            .id(product.getId())
            .name(product.getName())
            .price(product.getPrice())
            .quantity(product.getQuantity())
            .version(product.getVersion())
            .build();
    }

}
