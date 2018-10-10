package de.dhbw.myvitality.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PaymentMethod {

    @Id
    @GeneratedValue
    private String paymentId;
}
