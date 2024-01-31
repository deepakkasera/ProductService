package com.productservice.productservice.services;


import com.mysql.cj.PreparedQuery;
import com.productservice.productservice.dtos.GenericProductDto;
import com.productservice.productservice.models.Product;
import com.productservice.productservice.repositories.ProductRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    private ProductRepository productRepository;

    public SearchService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<GenericProductDto> searchProducts(String query, int pageNumber, int pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
        List<Product> products = productRepository.findAllByTitleContainingIgnoreCase(query, pageRequest);
        List<GenericProductDto> genericProductDtos = new ArrayList<>();
        for (Product product : products) {
            genericProductDtos.add(product.from(product));
        }
        return genericProductDtos;
    }
}

