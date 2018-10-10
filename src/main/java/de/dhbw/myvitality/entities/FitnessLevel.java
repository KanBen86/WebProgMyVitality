package de.dhbw.myvitality.entities;

import org.springframework.boot.autoconfigure.AutoConfigurationPackage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FitnessLevel {

    @Id
    @GeneratedValue
    private String fitnessLevelId;

    public FitnessLevel() {
    }

    public String getFitnessLevelId() {
        return fitnessLevelId;
    }

    public void setFitnessLevelId(String fitnessLevelId) {
        this.fitnessLevelId = fitnessLevelId;
    }


}
