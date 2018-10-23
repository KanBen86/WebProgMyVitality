package de.dhbw.myvitality.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entityklasse für die Zahlungsmethode
 * @author Fabian Lieb
 */
@Entity
public class PaymentMethod {

    @Id
    @GeneratedValue
    private String paymentId;
}
