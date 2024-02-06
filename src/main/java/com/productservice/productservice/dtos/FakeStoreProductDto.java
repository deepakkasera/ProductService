package com.productservice.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class FakeStoreProductDto implements Serializable {
    //DTO -> Data Transfer Objects.
    private Long id;
    private String title;
    private int price;
    private String category;
    private String description;
    private String image;
}
