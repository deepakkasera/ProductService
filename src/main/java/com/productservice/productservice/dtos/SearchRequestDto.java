package com.productservice.productservice.dtos;

import com.productservice.productservice.models.SortParam;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchRequestDto {
    private String query; //Title of the product
    private int pageNumber;
    private int itemsPerPage;
    //private List<String> sortParams; //['title', 'price', 'rating']
    private List<SortParam> sortParams;
}
