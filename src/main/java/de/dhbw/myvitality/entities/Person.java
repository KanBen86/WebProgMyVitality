package de.dhbw.myvitality.entities;

import javax.persistence.*;

@Entity
@Table
public class Person {

    @Id()
    @GeneratedValue()
    @Column()
    private String personId;
}
