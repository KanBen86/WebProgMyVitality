package de.dhbw.myvitality.entities;

import javax.persistence.*;

@Entity
@Table
public class Order {

    @Id
    @GeneratedValue
    @Column
    private String orderId;
}
