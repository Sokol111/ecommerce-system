package com.sokol.ecommerce.core.service;

import com.sokol.ecommerce.core.domain.Product;
import com.sokol.ecommerce.core.dto.CreateProductDto;

public interface ProductService {

    Product create(CreateProductDto dto);

    Product getById(String id);

}
