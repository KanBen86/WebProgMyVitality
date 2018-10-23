package de.dhbw.myvitality.entities;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entityklasse für das Fitnesslevel
 * @author Fabian Lieb
 */
@Entity
public class FitnessLevel {

    //Felder der Klasse

    @Id
    @GeneratedValue
    private String fitnessLevelId;

    //Konstruktoren

    public FitnessLevel() {
    }

    //Getter & Setter

    public String getFitnessLevelId() {
        return fitnessLevelId;
    }

    public void setFitnessLevelId(String fitnessLevelId) {
        this.fitnessLevelId = fitnessLevelId;
    }


}
