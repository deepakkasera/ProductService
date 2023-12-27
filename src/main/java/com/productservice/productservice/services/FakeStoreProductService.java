package com.productservice.productservice.services;

import com.productservice.productservice.dtos.FakeStoreProductDto;
import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.exceptions.ProductNotFoundException;
import com.productservice.productservice.security.JWTObject;
import com.productservice.productservice.security.TokenValidator;
import com.productservice.productservice.thirdPartyClients.fakestoreclient.FakeStoreClient;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Primary
@Service
public class FakeStoreProductService implements ProductService {
    private final FakeStoreClient fakeStoreAdapter;
    private TokenValidator tokenValidator;

    FakeStoreProductService(FakeStoreClient fakeStoreAdapter, TokenValidator tokenValidator) {
        this.fakeStoreAdapter = fakeStoreAdapter;
        this.tokenValidator = tokenValidator;
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
    public GenericProductDto getProductById(String authToken, Long id) throws ProductNotFoundException {
        //Integrate the FakeStore API.
        //RestTemplate
        Optional<JWTObject> jwtObjectOptional = tokenValidator.validateToken(authToken);

        if (jwtObjectOptional.isEmpty()) {
            //Invalid token
            //reject the request;
            return null;
        }
        JWTObject jwtObject = jwtObjectOptional.get();
        Long userId = jwtObject.getUserId();

        return convertToGenericProductDto(fakeStoreAdapter.getProductById(id));
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        List<FakeStoreProductDto> fakeStoreProductDtos = fakeStoreAdapter.getAllProducts();

        List<GenericProductDto> genericProductDtos = new ArrayList<>();
        for (FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos) {
            genericProductDtos.add(convertToGenericProductDto(fakeStoreProductDto));
        }
        return genericProductDtos;
    }

    @Override
    public GenericProductDto deleteProductById(Long id) {
        return convertToGenericProductDto(fakeStoreAdapter.deleteProductById(id));
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto genericProductDto) {
        return convertToGenericProductDto(fakeStoreAdapter.createProduct(genericProductDto));
    }

    @Override
    public void updateProductById() {
        //
    }
}
