package com.sokol.ecommerce.core.service;

import com.sokol.ecommerce.core.domain.Product;
import com.sokol.ecommerce.core.dto.CreateProductDto;
import com.sokol.ecommerce.core.handler.ProductHandler;
import com.sokol.ecommerce.core.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    private final ProductHandler productHandler;

    @Override
    public Product create(CreateProductDto dto) {
        var product = productHandler.create(dto);
        return productRepository.insert(product);
    }

    @Override
    public Product getById(String id) {
        return productRepository.getById(id);
    }


}
