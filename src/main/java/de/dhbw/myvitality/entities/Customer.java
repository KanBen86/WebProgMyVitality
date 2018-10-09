package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.util.List;

public class Customer {

    private String customerId;

    private Address delivieryAddress;

    private Address billAddress;

    private Goal goal;

    private List<TrainingSchedule> trainingPlan;

    private FitnessLevel fitnessLevel;

    private String preferredTypeOfPayment;
}
