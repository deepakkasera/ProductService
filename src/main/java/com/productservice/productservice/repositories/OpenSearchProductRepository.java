package com.productservice.productservice.repositories;

import com.productservice.productservice.models.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OpenSearchProductRepository extends OpenSearchRepository<Product, Long> {
    List<Product> findAllByTitle(String title);

    Optional<Product> findById(Long productId);

    Product save(Product product);

    List<Product> findAllByTitleContainingIgnoreCase(String title, Pageable pageable);
}
