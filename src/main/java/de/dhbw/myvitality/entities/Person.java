package de.dhbw.myvitality.entities;

import de.dhbw.myvitality.enums.ENUM_SEX;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Person {

    @Id()
    @GeneratedValue()
    @Column()
    private String personId;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    @OneToOne(fetch = FetchType.LAZY)
    private Address address;

    @Column
    private LocalDateTime dateOfBirth;

    @Column
    private String emailAddress;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String phoneNo;

    @Column
    private ENUM_SEX sex;

    @Column
    private List<Bank> accounts;

    public Person(String personId, String firstname, String lastname, Address address, LocalDateTime dateOfBirth, String emailAddress, String username, String password, String phoneNo, ENUM_SEX sex, List<Bank> accounts) {
        this.personId = personId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.username = username;
        this.password = password;
        this.phoneNo = phoneNo;
        this.sex = sex;
        this.accounts = accounts;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public ENUM_SEX getSex() {
        return sex;
    }

    public void setSex(ENUM_SEX sex) {
        this.sex = sex;
    }

    public List<Bank> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Bank> accounts) {
        this.accounts = accounts;
    }
}
