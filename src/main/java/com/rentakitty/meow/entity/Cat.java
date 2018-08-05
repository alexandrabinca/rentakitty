package com.rentakitty.meow.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name = "cat")
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    private Long catId;

    @Column
    private String name;

    @Column
    private Breed breed;

    @Column
    private String description;

    @Column
    private String picture;

    @Column
    private BigDecimal price;

    @OneToMany
    private List<RentDetails> rentDetails;

    @Column
    private boolean active;


}
