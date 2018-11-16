package de.dhbw.myvitality.entities;

import de.dhbw.myvitality.enums.ENUM_DEPARTMENT;
import de.dhbw.myvitality.enums.ENUM_ROLL;
import de.dhbw.myvitality.enums.ENUM_SEX;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Employee extends Person{

    @Id
    private String employeeId;

    private ENUM_DEPARTMENT department;

    private ENUM_ROLL authorities;

    private String superior; // holds the employeeId of the superior

    public Employee() {
    }

    public Employee(String employeeId, ENUM_DEPARTMENT department, ENUM_ROLL authorities, String superior) {
        this.employeeId = "mvu" + employeeId;
        this.department = department;
        this.authorities = authorities;
        this.superior = (superior!=null)?"mvu" + superior : superior;
    }

    public Employee(String firstname, String lastname, Adress adress, String dateOfBirth, String emailAddress, String username, String password, String phoneNo, ENUM_SEX sex, List<Bank> accounts, String employeeId, ENUM_DEPARTMENT department, ENUM_ROLL authorities, String superior) {
        super(firstname, lastname, adress, dateOfBirth, emailAddress, username, password, phoneNo, sex, accounts);
        this.employeeId = "mvu" + employeeId;
        this.department = department;
        this.authorities = authorities;
        this.superior = (superior!=null)?"mvu" + superior : superior;
    }

    public ENUM_ROLL getAuthorities() {
        return authorities;
    }

    public void setAuthorities(ENUM_ROLL authorities) {
        this.authorities = authorities;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = "mvu" + employeeId;
    }

    public ENUM_DEPARTMENT getDepartment() {
        return department;
    }

    public void setDepartment(ENUM_DEPARTMENT department) {
        this.department = department;
    }

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = (superior != null) ? "mvu" + superior : superior;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", department=" + department +
                ", authorities=" + authorities +
                ", superior='" + superior + '\'' +
                '}';
    }
}
