package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Customer {

    @Id
    @GeneratedValue

    @Column
    private String customerId;

    @Column
    private Address delivieryAddress;

    @Column
    private Address billAddress;

    @Column
    private Goal goal;

    @Column
    private List<TrainingSchedule> trainingPlan;

    @Column
    private FitnessLevel fitnessLevel;

    @Column
    private String preferredTypeOfPayment;
}
