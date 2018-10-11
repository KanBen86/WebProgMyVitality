package de.dhbw.myvitality.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/***
 * Entityklasse für eine Bank
 * @author tamino.fischer
 */
@Entity
public class Bank {
    //Felder
    @Id
    @GeneratedValue
    private String bankId;

    //Getter & Setter

    //Konsutuktoren

    //Override Methoden
}
