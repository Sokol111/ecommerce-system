package com.sokol.ecommerce.core.repository;

import com.sokol.ecommerce.core.domain.Product;

public interface ProductRepository {

    Product insert(Product product);

    Product getById(String id);
}
