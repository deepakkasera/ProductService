package com.productservice.productservice.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseModel {
    private String title;
    private String description;
    private String image;

    //Category isn't a primitive attribute, it's a relation.
    //category_id in the product table.
    @ManyToOne(optional = false)
    private Category category;

    @OneToOne(cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    private Price price;
}

/*
    1          1
 Product --- Category
     M         1
 */
