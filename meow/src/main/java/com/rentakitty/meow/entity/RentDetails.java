package com.rentakitty.meow.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "rent_details")
public class RentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rent_details_id")
    private Long rentDetailsId;

    @ManyToOne
    @JoinColumn(name = "cat_id")
    private Cat cat;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "to_date")
    private LocalDate toDate;

    @Column
    private boolean confirmed;

}
