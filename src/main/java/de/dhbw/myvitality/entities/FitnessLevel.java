package de.dhbw.myvitality.entities;

import de.dhbw.myvitality.enums.ENUM_SEX;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Entityklasse für das Fitnesslevel
 * @author Fabian Lieb
 */
@Entity
public class FitnessLevel {

    //Felder der Klasse

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String fitnessLevelId;

    private String sex;

    private String weight;

    private String height;

    private String experience;

    private String job;

    private String arm;

    private String chest;

    private String stomach;

    private String waist;

    private String thigh;

    private String calf;

    private String foodIntolerance;

    private String injury;

    private String medicine;

    //Konstruktoren

    public FitnessLevel(String sex, String weight, String height, String experience, String job, String arm, String chest, String stomach, String waist, String thigh, String calf, String foodIntolerance, String injury, String medicine) {

        this.sex=sex;
        this.weight=weight;
        this.height=height;
        this.experience=experience;
        this.job=job;
        this.arm=arm;
        this.chest=chest;
        this.stomach=stomach;
        this.waist=waist;
        this.thigh=thigh;
        this.calf=calf;
        this.foodIntolerance=foodIntolerance;
        this.injury=injury;
        this.medicine=medicine;
    }

    public FitnessLevel(){

    }

    //Getter & Setter

    public String getFitnessLevelId() {
        return fitnessLevelId;
    }

    public void setFitnessLevelId(String fitnessLevelId) {
        this.fitnessLevelId = fitnessLevelId;
    }

    public String getSex() { return sex; }

    public void setSex(String sex) { this.sex = sex; }

    public String getWeight() { return weight; }

    public void setWeight(String weight) {this.weight = weight; }

    public String getHeight() { return height; }

    public void setHeight(String height) { this.height = height;}

    public String getExperience() { return experience; }

    public void setExperience(String experience) { this.experience = experience;}

    public String getJob() { return job; }

    public void setJob(String job) { this.job = job;}

    public String getArm() { return arm; }

    public void setArm(String arm) { this.arm = arm;}

    public String getChest() { return chest; }

    public void setChest(String chest) { this.chest = chest;}

    public String getStomach() { return stomach; }

    public void setStomach(String stomach) { this.stomach = stomach;}

    public String getWaist() { return waist; }

    public void setWaist(String waist) { this.waist = waist;}

    public String getThigh() { return thigh; }

    public void setThigh(String thigh) { this.thigh = thigh;}

    public String getCalf() { return calf; }

    public void setCalf(String calf) { this.calf = calf;}

    public String getFoodIntolerance() { return foodIntolerance; }

    public void setFoodIntolerance(String foodIntolerance) { this.foodIntolerance = foodIntolerance;}

    public String getInjury() { return injury; }

    public void setInjury(String injury) { this.injury = injury;}

    public String getMedicine() { return medicine; }

    public void setMedicine(String medicine) { this.medicine = medicine;}

    //Override Methoden toString, equals, hashCode
    @Override
    public String toString() {
        return "Fitnesslevel{" +
                "fitnessLevelId='" + fitnessLevelId + '\'' +
                ", sex='" + sex + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", experience='" + experience + '\'' +
                ", job='" + job + '\'' +
                ", arm='" + arm + '\'' +
                ", chest='" + chest + '\'' +
                ", stomach='" + stomach + '\'' +
                ", waist='" + waist + '\'' +
                ", thigh='" + thigh + '\'' +
                ", calf='" + calf + '\'' +
                ", foodIntolerance='" + foodIntolerance + '\'' +
                ", injury='" + injury + '\'' +
                ", medicine='" + medicine + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object e) {
        if (this == e) return true;
        if (!(e instanceof FitnessLevel)) return false;
        FitnessLevel fitnessLevel = (FitnessLevel) e;
        return Objects.equals(getFitnessLevelId(), fitnessLevel.getFitnessLevelId()) &&
                Objects.equals(getSex(), fitnessLevel.getSex()) &&
                Objects.equals(getWeight(), fitnessLevel.getWeight()) &&
                Objects.equals(getHeight(), fitnessLevel.getHeight()) &&
                Objects.equals(getExperience(), fitnessLevel.getExperience()) &&
                Objects.equals(getJob(), fitnessLevel.getJob()) &&
                Objects.equals(getArm(), fitnessLevel.getArm()) &&
                Objects.equals(getChest(), fitnessLevel.getChest()) &&
                Objects.equals(getStomach(), fitnessLevel.getStomach()) &&
                Objects.equals(getWaist(), fitnessLevel.getWaist()) &&
                Objects.equals(getThigh(), fitnessLevel.getThigh()) &&
                Objects.equals(getCalf(), fitnessLevel.getCalf()) &&
                Objects.equals(getFoodIntolerance(), fitnessLevel.getFoodIntolerance()) &&
                Objects.equals(getInjury(), fitnessLevel.getInjury()) &&
                Objects.equals(getMedicine(), fitnessLevel.getMedicine());


    }

    @Override
    public int hashCode() {
        return Objects.hash(getFitnessLevelId(), getSex(), getWeight(), getHeight(), getExperience(), getJob(), getArm(), getChest(), getStomach(), getWaist(), getThigh(), getCalf(), getFoodIntolerance(), getInjury(), getMedicine());
    }
}
