package de.dhbw.myvitality.enums;

public enum ENUM_SEX {

    MALE("männlich"), FEMALE("weiblich");


    private String sex;

    private ENUM_SEX(String arg){
        this.sex = arg;
    }

    public String getSex() {
        return sex;
    }
}
