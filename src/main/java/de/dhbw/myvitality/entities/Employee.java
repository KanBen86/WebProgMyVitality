package de.dhbw.myvitality.entities;

import de.dhbw.myvitality.enums.ENUM_DEPARTMENT;
import de.dhbw.myvitality.enums.ENUM_ROLL;

import java.util.List;

public class Employee extends Person{
    private ENUM_DEPARTMENT department;
    private List<ENUM_ROLL> authorities;
    private String superior; // holds he employeeId of the superior
}
