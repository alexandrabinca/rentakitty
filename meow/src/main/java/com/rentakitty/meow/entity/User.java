package com.rentakitty.meow.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String address;
}
