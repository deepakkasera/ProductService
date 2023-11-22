package com.productservice.productservice.controllers;

import com.productservice.productservice.dtos.FakeStoreProductDto;
import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.services.FakeStoreProductService;
import com.productservice.productservice.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

    // @Autowired OPTIONAL
    //Constructor Injection.
    ProductController(@Qualifier("fakeStoreProductService") ProductService productService) {
        this.productService = productService;
    }

//    @Autowired
//    public void setProductService(ProductService productService) {
//        this.productService = productService;
//    }

    //localhost:8080/products/12345
    @GetMapping("/{id}")
    public GenericProductDto getProductById(@PathVariable("id") Long id) {
        return productService.getProductById(id);
    }

    @GetMapping
    public void getAllProducts() {

    }


    @DeleteMapping("/{id}")
    public void deleteProductById() {

    }

    public void createProduct() {

    }

    public void updateProductById() {

    }
}


/*

3 ways of Dependency Injection :-

1. Constructor Injection
2. Field Injection
3. Setter Injection.
 */
