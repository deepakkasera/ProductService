package com.productservice.productservice.services;

import com.productservice.productservice.dtos.FakeStoreProductDto;
import com.productservice.productservice.dtos.GenericProductDto;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductService {
    GenericProductDto getProductById(Long id);

    void getAllProducts();

    void deleteProductById();

    void createProduct();

    void updateProductById();
}
