package de.dhbw.myvitality.entities;

import javax.persistence.*;

/**
 * Entityklasse für die Ziele
 * @author Fabian Lieb
 */
@Entity
public class Goal {

    //Felder der Klasse

    @Id
    @GeneratedValue
    private String goal_Id;

    private boolean weightLoss;

    private boolean gainStrength;

    private boolean minimizeWeaknesses;

    private boolean metabolicHealth;

    private boolean gainEndurance;

    //Konstruktoren

    public Goal(boolean weightLoss, boolean gainStrength, boolean minimizeWeaknesses, boolean metabolicHealth, boolean gainEndurance) {
        this.weightLoss = weightLoss;
        this.gainStrength = gainStrength;
        this.minimizeWeaknesses = minimizeWeaknesses;
        this.metabolicHealth = metabolicHealth;
        this.gainEndurance = gainEndurance;
    }

    //Getter & Setter

    public String getGoal_Id() {
        return goal_Id;
    }

    public void setGoal_Id(String goal_Id) {
        this.goal_Id = goal_Id;
    }

    public boolean isWeightLoss() {
        return weightLoss;
    }

    public void setWeightLoss(boolean weightLoss) {
        this.weightLoss = weightLoss;
    }

    public boolean isGainStrength() {
        return gainStrength;
    }

    public void setGainStrength(boolean gainStrength) {
        this.gainStrength = gainStrength;
    }

    public boolean isMinimizeWeaknesses() {
        return minimizeWeaknesses;
    }

    public void setMinimizeWeaknesses(boolean minimizeWeaknesses) {
        this.minimizeWeaknesses = minimizeWeaknesses;
    }

    public boolean isMetabolicHealth() {
        return metabolicHealth;
    }

    public void setMetabolicHealth(boolean metabolicHealth) {
        this.metabolicHealth = metabolicHealth;
    }

    public boolean isGainEndurance() {
        return gainEndurance;
    }

    public void setGainEndurance(boolean gainEndurance) {
        this.gainEndurance = gainEndurance;
    }
}
