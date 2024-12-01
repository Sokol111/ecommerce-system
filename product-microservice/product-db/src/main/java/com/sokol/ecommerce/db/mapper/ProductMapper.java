package com.sokol.ecommerce.db.mapper;

import com.sokol.ecommerce.core.domain.Product;
import com.sokol.ecommerce.db.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product map(ProductEntity entity) {
        return Product.builder()
            .id(entity.getId())
            .name(entity.getName())
            .createdAt(entity.getCreatedAt())
            .enabled(entity.isEnabled())
            .price(entity.getPrice())
            .quantity(entity.getQuantity())
            .version(entity.getVersion())
            .build();
    }

    public ProductEntity map(Product product) {
        return ProductEntity.builder()
            .id(product.getId())
            .name(product.getName())
            .createdAt(product.getCreatedAt())
            .enabled(product.isEnabled())
            .price(product.getPrice())
            .quantity(product.getQuantity())
            .version(product.getVersion())
            .build();
    }

}
