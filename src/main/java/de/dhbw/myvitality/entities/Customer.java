package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.util.List;
@Entity
public class Customer extends Person{
    @Id
    private String customerId;

    @OneToOne
    @JoinColumn(name = "delivery_address_id")
    private Address deliveryAddress;

    @OneToOne
    @JoinColumn(name = "bill_address_id")
    private Address billAddress;

    @OneToOne
    @JoinColumn(name = "customer_goal_id")
    private Goal goal;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "customer_schedule_id")
    private List<TrainingSchedule> trainingSchedules;

    @OneToOne
    @JoinColumn(name = "customer_fitness_level_id")
    private FitnessLevel fitnessLevel;

    private String preferredTypeOfPayment;

    public Customer(String customerId, Address deliveryAddress, Address billAddress, Goal goal, List<TrainingSchedule> trainingSchedules, FitnessLevel fitnessLevel, String preferredTypeOfPayment) {
        this.customerId = customerId;
        this.deliveryAddress = deliveryAddress;
        this.billAddress = billAddress;
        this.goal = goal;
        this.trainingSchedules = trainingSchedules;
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
        return deliveryAddress;
    }

    public void setDelivieryAddress(Address delivieryAddress) {
        this.deliveryAddress = delivieryAddress;
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

    public List<TrainingSchedule> getTrainingSchedules() {
        return trainingSchedules;
    }

    public void setTrainingSchedules(List<TrainingSchedule> trainingSchedules) {
        this.trainingSchedules = trainingSchedules;
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

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", deliveryAddress=" + deliveryAddress +
                ", billAddress=" + billAddress +
                ", goal=" + goal +
                ", trainingSchedules=" + trainingSchedules +
                ", fitnessLevel=" + fitnessLevel +
                ", preferredTypeOfPayment='" + preferredTypeOfPayment + '\'' +
                '}';
    }
}
