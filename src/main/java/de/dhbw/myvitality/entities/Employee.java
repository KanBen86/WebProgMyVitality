package de.dhbw.myvitality.entities;

import de.dhbw.myvitality.enums.ENUM_DEPARTMENT;
import de.dhbw.myvitality.enums.ENUM_ROLL;
import de.dhbw.myvitality.enums.ENUM_SEX;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.List;
@Entity
public class Employee extends Person{

    @Id
    private String employeeId;

    private ENUM_DEPARTMENT department;
    // TODO wie kann man diese Liste besser abbilden?
    @Transient
    private List<ENUM_ROLL> authorities;

    private String superior; // holds he employeeId of the superior

    public Employee() {
    }

    public Employee(String employeeId, ENUM_DEPARTMENT department, List<ENUM_ROLL> authorities, String superior) {
        this.employeeId = employeeId;
        this.department = department;
        this.authorities = authorities;
        this.superior = superior;
    }

    public Employee(String firstname, String lastname, Address address, LocalDateTime dateOfBirth, String emailAddress, String username, String password, String phoneNo, ENUM_SEX sex, List<Bank> accounts, String employeeId, ENUM_DEPARTMENT department, List<ENUM_ROLL> authorities, String superior) {
        super(firstname, lastname, address, dateOfBirth, emailAddress, username, password, phoneNo, sex, accounts);
        this.employeeId = employeeId;
        this.department = department;
        this.authorities = authorities;
        this.superior = superior;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public ENUM_DEPARTMENT getDepartment() {
        return department;
    }

    public void setDepartment(ENUM_DEPARTMENT department) {
        this.department = department;
    }

    public List<ENUM_ROLL> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<ENUM_ROLL> authorities) {
        this.authorities = authorities;
    }

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }
}
