package com.sokol.ecommerce.db.repository;

import com.sokol.ecommerce.core.domain.Product;
import com.sokol.ecommerce.core.repository.ProductRepository;
import com.sokol.ecommerce.db.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final MongoTemplate mongoTemplate;

    private final ProductMapper productMapper;

    @Override
    public Product insert(Product product) {
        return productMapper.map(mongoTemplate.insert(productMapper.map(product)));
    }

    @Override
    public Product getById(String id) {
        return mongoTemplate.findById(id, Product.class);
    }
}
