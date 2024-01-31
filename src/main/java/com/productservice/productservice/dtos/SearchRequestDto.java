package com.productservice.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequestDto {
    private String query; //Title of the product
    private int pageNumber;
    private int itemsPerPage;
}
