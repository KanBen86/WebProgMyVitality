package de.dhbw.myvitality.entities;

import javax.persistence.*;

@Entity
public class Goal {

    @Id
    @GeneratedValue
    @Column
    private String goal_Id;

    @Column
    private boolean weightLoss;

    @Column
    private boolean gainStrength;

    @Column
    private boolean minimizeWeaknesses;

    @Column
    private boolean metabolicHealth;

    @Column
    private boolean gainEndurance;

    public Goal(boolean weightLoss, boolean gainStrength, boolean minimizeWeaknesses, boolean metabolicHealth, boolean gainEndurance) {
        this.weightLoss = weightLoss;
        this.gainStrength = gainStrength;
        this.minimizeWeaknesses = minimizeWeaknesses;
        this.metabolicHealth = metabolicHealth;
        this.gainEndurance = gainEndurance;
    }

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
