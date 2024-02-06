package com.productservice.productservice.dtos;

import com.productservice.productservice.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class GenericProductDto {
    private Long id;
    private String title;
    private int price;
    private String category;
    private String description;
    private String image;
    private int inventoryCount;
}
