package com.productservice.productservice.services;

import org.springframework.stereotype.Service;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService {
    @Override
    public String getProductById(Long id) {
        //Integrate the FakeStore API.
        return "Hello Hello !! Product id: " + id;
    }

    @Override
    public void getAllProducts() {

    }

    @Override
    public void deleteProductById() {

    }

    @Override
    public void createProduct() {

    }

    @Override
    public void updateProductById() {

    }
}
