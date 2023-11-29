package com.productservice.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel {
    private String title;
    private String description;
    private int price;
    private String image;

    //Category isn't a primitive attribute, it's a relation.
    @ManyToOne
    private Category category;
}

/*
    1          1
 Product --- Category
     M         1
 */
