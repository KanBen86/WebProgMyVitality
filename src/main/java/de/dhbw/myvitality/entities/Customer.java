package de.dhbw.myvitality.entities;

import java.util.List;

public class Customer {

    private String customerId;

    private Address delivieryAddress;

    private Address billAddress;

    private Goal goal;

    private List<TrainingSchedule> trainingPlan;

    private FitnessLevel fitnessLevel;

    private String preferredTypeOfPayment;

    public Customer(String customerId, Address delivieryAddress, Address billAddress, Goal goal, List<TrainingSchedule> trainingPlan, FitnessLevel fitnessLevel, String preferredTypeOfPayment) {
        this.customerId = customerId;
        this.delivieryAddress = delivieryAddress;
        this.billAddress = billAddress;
        this.goal = goal;
        this.trainingPlan = trainingPlan;
        this.fitnessLevel = fitnessLevel;
        this.preferredTypeOfPayment = preferredTypeOfPayment;
    }

    public Customer() {
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Address getDelivieryAddress() {
        return delivieryAddress;
    }

    public void setDelivieryAddress(Address delivieryAddress) {
        this.delivieryAddress = delivieryAddress;
    }

    public Address getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(Address billAddress) {
        this.billAddress = billAddress;
    }

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    public List<TrainingSchedule> getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(List<TrainingSchedule> trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    public FitnessLevel getFitnessLevel() {
        return fitnessLevel;
    }

    public void setFitnessLevel(FitnessLevel fitnessLevel) {
        this.fitnessLevel = fitnessLevel;
    }

    public String getPreferredTypeOfPayment() {
        return preferredTypeOfPayment;
    }

    public void setPreferredTypeOfPayment(String preferredTypeOfPayment) {
        this.preferredTypeOfPayment = preferredTypeOfPayment;
    }
}
