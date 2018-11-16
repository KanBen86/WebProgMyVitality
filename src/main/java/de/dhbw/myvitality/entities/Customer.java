package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.util.List;
@Entity
public class Customer extends Person{
    @Id
    private String customerId;

    @OneToOne
    @JoinColumn(name = "delivery_address_id")
    private Adress deliveryAdress;

    @OneToOne
    @JoinColumn(name = "bill_address_id")
    private Adress billAdress;

    @OneToOne
    @JoinColumn(name = "customer_goal_id")
    private Goal goal;

    @OneToOne
    @JoinColumn(name = "customer_fitness_level_id")
    private FitnessLevel fitnessLevel;

    private String preferredTypeOfPayment;

    public Customer(String customerId, Adress deliveryAdress, Adress billAdress, Goal goal, FitnessLevel fitnessLevel, String preferredTypeOfPayment) {
        this.customerId = customerId;
        this.deliveryAdress = deliveryAdress;
        this.billAdress = billAdress;
        this.goal = goal;
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

    public Adress getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(Adress deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public Adress getBillAdress() {
        return billAdress;
    }

    public void setBillAdress(Adress billAdress) {
        this.billAdress = billAdress;
    }

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
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
        return super.toString() +
                "Customer{" +
                "customerId='" + customerId + '\'' +
                ", deliveryAdress=" + deliveryAdress +
                ", billAdress=" + billAdress +
                ", goal=" + goal +
                ", fitnessLevel=" + fitnessLevel +
                ", preferredTypeOfPayment='" + preferredTypeOfPayment + '\'' +
                '}';
    }
}
