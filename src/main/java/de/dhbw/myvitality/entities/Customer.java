package de.dhbw.myvitality.entities;

import javax.persistence.*;

@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue
    @Column
    private String customerId;
}
