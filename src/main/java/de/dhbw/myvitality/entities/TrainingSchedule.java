package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table
public class TrainingSchedule {

    @Id
    @GeneratedValue
    @Column
    private String scheduleId;

    @Column
    private int exerciseNo;

    @Column
    private String exerciseDesc;

    @Column
    private int sets;

    @Column
    private int reps;

    @Column
    private int breakSec;

    @Column
    @OneToOne(fetch = FetchType.LAZY)
    private FitnessLevel fitnessLevel;

    @Column
    private Integer[] heartFrequency = new Integer[2];

    public TrainingSchedule(String scheduleId, int exerciseNo, String exerciseDesc, int sets, int reps, int breakSec, Integer[] heartFrequency) {
        this.scheduleId = scheduleId;
        this.exerciseNo = exerciseNo;
        this.exerciseDesc = exerciseDesc;
        this.sets = sets;
        this.reps = reps;
        this.breakSec = breakSec;
        this.fitnessLevel = fitnessLevel;
        this.heartFrequency = heartFrequency;
    }

    public TrainingSchedule() {

    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public int getExerciseNo() {
        return exerciseNo;
    }

    public void setExerciseNo(int exerciseNo) {
        this.exerciseNo = exerciseNo;
    }

    public String getExerciseDesc() {
        return exerciseDesc;
    }

    public void setExerciseDesc(String exerciseDesc) {
        this.exerciseDesc = exerciseDesc;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getBreakSec() {
        return breakSec;
    }

    public void setBreakSec(int breakSec) {
        this.breakSec = breakSec;
    }

    public FitnessLevel getFitnessLevel() {
        return fitnessLevel;
    }

    public void setFitnessLevel(FitnessLevel fitnessLevel) {
        this.fitnessLevel = fitnessLevel;
    }

    public Integer[] getHeartFrequency() {
        return heartFrequency;
    }

    public void setHeartFrequency(Integer[] heartFrequency) {
        this.heartFrequency = heartFrequency;
    }
}
