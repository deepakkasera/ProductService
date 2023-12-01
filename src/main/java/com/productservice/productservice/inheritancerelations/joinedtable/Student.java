package com.productservice.productservice.inheritancerelations.joinedtable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "j_student")
@PrimaryKeyJoinColumn(name = "user_id")
public class Student extends User {
    private double psp;
}
