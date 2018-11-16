package de.dhbw.myvitality.entities;

import de.dhbw.myvitality.enums.ENUM_SEX;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@MappedSuperclass
public class Person {

    private String firstname;

    private String lastname;

    @OneToOne
    @JoinColumn(name = "person_address_id")
    private Adress adress;

    private String dateOfBirth;

    private String emailAddress;

    private String username;

    private String password;

    private String phoneNo;

    private ENUM_SEX sex;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "person_accounts_id")
    private List<Bank> accounts;

    public Person (){}

    public Person(String firstname, String lastname, Adress adress, String dateOfBirth, String emailAddress, String username, String password, String phoneNo, ENUM_SEX sex, List<Bank> accounts) {
    this.firstname = firstname;
        this.lastname = lastname;
        this.adress = adress;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.username = username;
        this.password = password;
        this.phoneNo = phoneNo;
        this.sex = sex;
        this.accounts = accounts;
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

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
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

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", adress=" + adress +
                ", dateOfBirth=" + dateOfBirth +
                ", emailAddress='" + emailAddress + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", sex=" + sex +
                '}';
    }
}
