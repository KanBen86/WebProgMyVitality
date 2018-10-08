package de.dhbw.myvitality.entities;

import javax.persistence.*;

@Entity
@Table
public class TrainingSchedule {

    @Id
    @GeneratedValue
    @Column
    private String scheduleId;


}
