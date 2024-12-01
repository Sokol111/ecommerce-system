package com.sokol.ecommerce.rest;

import com.sokol.ecommerce.core.service.ProductService;
import com.sokol.ecommerce.rest.dto.CreateProductRequest;
import com.sokol.ecommerce.rest.dto.ProductResponse;
import com.sokol.ecommerce.rest.mapper.RestProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService appProductService;

    private final RestProductMapper restProductMapper;

    @GetMapping("/get/{id}")
    public ProductResponse getById(@PathVariable String id) {
        return restProductMapper.map(appProductService.getById(id));
    }

    @PostMapping("/create")
    public ProductResponse createProduct(@RequestBody CreateProductRequest request) {
        return restProductMapper.map(appProductService.create(restProductMapper.map(request)));
    }


}
