package com.productservice.productservice.services;

import com.productservice.productservice.dtos.FakeStoreProductDto;
import com.productservice.productservice.dtos.GenericProductDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService {
    private RestTemplateBuilder restTemplateBuilder;

    private String specificProductUrl = "https://fakestoreapi.com/products/{id}";
    private String genericProductUrl = "https://fakestoreapi.com/products/";

    FakeStoreProductService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    private static GenericProductDto convertToGenericProductDto(FakeStoreProductDto fakeStoreProductDto) {
        GenericProductDto genericProductDto = new GenericProductDto();
        genericProductDto.setId(fakeStoreProductDto.getId());
        genericProductDto.setImage(fakeStoreProductDto.getImage());
        genericProductDto.setCategory(fakeStoreProductDto.getCategory());
        genericProductDto.setDescription(fakeStoreProductDto.getDescription());
        genericProductDto.setTitle(fakeStoreProductDto.getTitle());
        genericProductDto.setPrice(fakeStoreProductDto.getPrice());

        return genericProductDto;
    }

    @Override
    public GenericProductDto getProductById(Long id) {
        //Integrate the FakeStore API.
        //RestTemplate

        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> responseEntity =
                restTemplate.getForEntity(specificProductUrl, FakeStoreProductDto.class, id);

        //Convert FakeStoreProductDto to GenericProductDto before returning.
        return convertToGenericProductDto(responseEntity.getBody());
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        RestTemplate restTemplate = restTemplateBuilder.build();

        ResponseEntity<FakeStoreProductDto[]> responseEntity =
                restTemplate.getForEntity(genericProductUrl, FakeStoreProductDto[].class);

        //ArrayList<Integer> => ArrayList.class -> Erasure

        List<GenericProductDto> result = new ArrayList<>();
        List<FakeStoreProductDto> fakeStoreProductDtos = List.of(responseEntity.getBody());
        for(FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos) {
            result.add(convertToGenericProductDto(fakeStoreProductDto));
        }

        return result;
    }

    @Override
    public void deleteProductById() {

    }

    @Override
    public GenericProductDto createProduct(GenericProductDto genericProductDto) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductDto> responseEntity =
                restTemplate.postForEntity(genericProductUrl, genericProductDto, FakeStoreProductDto.class);

        return convertToGenericProductDto(responseEntity.getBody());
    }

    @Override
    public void updateProductById() {

    }
}
