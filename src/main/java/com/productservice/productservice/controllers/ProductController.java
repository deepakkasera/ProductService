package com.productservice.productservice.controllers;

import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.exceptions.ProductNotFoundException;
import com.productservice.productservice.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    // @Autowired OPTIONAL
    // Constructor Injection.
    // @Qualifier("fakeStoreProductService")
    ProductController(ProductService productService) {
        this.productService = productService;
    }

//    @Autowired
//    public void setProductService(ProductService productService) {
//        this.productService = productService;
//    }

    //localhost:8080/products/12345
    @GetMapping("/{id}")
    public GenericProductDto getProductById(@RequestHeader(value = HttpHeaders.AUTHORIZATION, required = false) String authToken, @PathVariable("id") Long id) throws ProductNotFoundException {
        GenericProductDto genericProductDto = productService.getProductById(authToken, id);
//        GenericProductDto genericProductDto1 = new GenericProductDto();


        return genericProductDto;
    }

    @GetMapping
    public List<GenericProductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    @DeleteMapping("/{id}")
    public GenericProductDto deleteProductById(@PathVariable("id") Long id) {
        return productService.deleteProductById(id);
    }

    @PostMapping
    public GenericProductDto createProduct(@RequestBody GenericProductDto genericProductDto) {
        return productService.createProduct(genericProductDto);
    }

    public void updateProductById() {

    }

//    @ExceptionHandler(ProductNotFoundException.class)
//    private ResponseEntity<ExceptionDto> handleProductNotFoundException(ProductNotFoundException productNotFoundException) {
//        ExceptionDto exceptionDto = new ExceptionDto();
//        exceptionDto.setHttpStatus(HttpStatus.NOT_FOUND);
//        exceptionDto.setMessage(productNotFoundException.getMessage());
//
//        ResponseEntity responseEntity = new ResponseEntity(exceptionDto, HttpStatus.NOT_FOUND);
//
//        return responseEntity;
//    }
}


/*

3 ways of Dependency Injection :-

1. Constructor Injection
2. Field Injection
3. Setter Injection.
 */
