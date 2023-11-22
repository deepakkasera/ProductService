package com.productservice.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FakeStoreProductDto {
    //DTO -> Data Transfer Objects.
    private Long id;
    private String title;
    private int price;
    private String category;
    private String description;
    private String image;
}
