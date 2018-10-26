package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Arrays;

/**
 * Entityklasse für den Trainingsplan
 * @author Fabian Lieb
 */
@Entity
public class TrainingSchedule {

    //Felder der Klasse

    @Id
    @GeneratedValue
    private long scheduleId;

    private int exerciseNo;

    private String exerciseDesc;

    private int sets;

    private int reps;

    private int breakSec;

    @OneToOne
    @JoinColumn(name = "schedule_fitness_level_id")
    private FitnessLevel fitnessLevel;

    private Integer[] heartFrequency = new Integer[2];

    //Konstruktoren

    public TrainingSchedule(long scheduleId, int exerciseNo, String exerciseDesc, int sets, int reps, int breakSec, FitnessLevel fitnessLevel, Integer[] heartFrequency) {
        this.scheduleId = scheduleId;
        this.exerciseNo = exerciseNo;
        this.exerciseDesc = exerciseDesc;
        this.sets = sets;
        this.reps = reps;
        this.breakSec = breakSec;
        this.fitnessLevel = fitnessLevel;
        this.heartFrequency = heartFrequency;
    }

    public TrainingSchedule() {}

    //Getter & Setter

    public long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(long scheduleId) {
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

    @Override
    public String toString() {
        return "TrainingSchedule{" +
                "scheduleId=" + scheduleId +
                ", exerciseNo=" + exerciseNo +
                ", exerciseDesc='" + exerciseDesc + '\'' +
                ", sets=" + sets +
                ", reps=" + reps +
                ", breakSec=" + breakSec +
                ", fitnessLevel=" + fitnessLevel +
                ", heartFrequency=" + Arrays.toString(heartFrequency) +
                '}';
    }
}
