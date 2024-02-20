package com.productservice.productservice.services;

import com.productservice.productservice.ProductServiceApplication;
import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.dtos.UserDto;
import com.productservice.productservice.exceptions.ProductNotFoundException;
import com.productservice.productservice.models.Product;
//import com.productservice.productservice.repositories.OpenSearchProductRepository;
import com.productservice.productservice.repositories.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Primary
@Service
public class SelfProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    private RestTemplate restTemplate;
    //private OpenSearchProductRepository openSearchProductRepository;

    SelfProductServiceImpl(ProductRepository productRepository, RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.productRepository = productRepository;
        //this.openSearchProductRepository = openSearchProductRepository;
    }

    @Override
    public GenericProductDto getProductById(String authToken, Long id) throws ProductNotFoundException {
        //Make a DB call & get the product with given id.
        GenericProductDto genericProductDto = new GenericProductDto();
//        Optional<Product> optionalProduct = productRepository.findById(UUID.fromString("9fa06bde-3787-4199-88a3-98d8d3ccbee7"));
//
//        Product product = optionalProduct.get();
//
//        genericProductDto.setDescription(product.getDescription());
//        genericProductDto.setTitle(product.getTitle());
//        genericProductDto.setImage(product.getImage());
//        genericProductDto.setCategory(product.getCategory().toString());

//        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserDto> userDtoResponseEntity = restTemplate.getForEntity("http://userservice/users/1", UserDto.class);

        return genericProductDto;
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
//        PageRequest pageRequest = PageRequest.of(1, 2);
//        List<Product> products = productRepository.findAllByTitleContainingIgnoreCase("iPhone", pageRequest);
        return null;
    }

    @Override
    public GenericProductDto deleteProductById(Long id) {
        return null;
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto genericProductDto) {
//        Product product = new Product();
//        product.setTitle(genericProductDto.getTitle());
//        product.setImage(genericProductDto.getImage());
//        //
//
//        Product savedProduct  = productRepository.save(product);
        //openSearchProductRepository.save(savedProduct);
        return null;
    }

    @Override
    public void updateProductById() {

    }
}
