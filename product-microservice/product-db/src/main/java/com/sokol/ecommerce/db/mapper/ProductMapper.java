package com.sokol.ecommerce.db.mapper;

import com.sokol.ecommerce.commons.valueobject.Name;
import com.sokol.ecommerce.commons.valueobject.ObjectId;
import com.sokol.ecommerce.commons.valueobject.Price;
import com.sokol.ecommerce.core.domain.Product;
import com.sokol.ecommerce.db.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product map(ProductEntity entity) {
        return Product.builder()
            .id(new ObjectId(entity.getId()))
            .name(new Name(entity.getName()))
            .createdAt(entity.getCreatedAt())
            .enabled(entity.isEnabled())
            .price(new Price(entity.getPrice()))
            .quantity(entity.getQuantity())
            .version(entity.getVersion())
            .build();
    }

    public ProductEntity map(Product product) {
        return ProductEntity.builder()
            .id(product.getId().getValue())
            .name(product.getName().getValue())
            .createdAt(product.getCreatedAt())
            .enabled(product.isEnabled())
            .price(product.getPrice().getValue())
            .quantity(product.getQuantity())
            .version(product.getVersion())
            .build();
    }

}
