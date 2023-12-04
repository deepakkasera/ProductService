package com.productservice.productservice.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseModel {
    @Column(nullable = false)
    private String name;

    @OneToMany(fetch = jakarta.persistence.FetchType.EAGER, mappedBy = "category")
    private List<Product> products;
}


/*

WA group -

    - Creator
    - Admin
    - Members


Student ----- Batch

    1             1
Student -------- Batch (current batch) => M:1
   M                1

   1              M
Student -------- Batch (previous batch) => M:M
   M               1
 - current batch
 - previous batch
 */

//Category ------ Product
