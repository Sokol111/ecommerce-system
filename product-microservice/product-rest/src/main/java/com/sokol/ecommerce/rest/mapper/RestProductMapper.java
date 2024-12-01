package com.sokol.ecommerce.rest.mapper;

import com.sokol.ecommerce.core.api.Product;
import com.sokol.ecommerce.core.api.dto.CreateProductDto;
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
            .id(product.getId().getValue())
            .name(product.getName().getValue())
            .price(product.getPrice().getValue())
            .quantity(product.getQuantity())
            .version(product.getVersion())
            .build();
    }

}
