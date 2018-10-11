package de.dhbw.myvitality.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

/***
 * Entityklasse für eine Adresse
 * Aus Komplexitätsgründen wurde hier das deutsche Adressformat gewählt
 * @author tamino.fischer
 */
@Entity
public class Adress {

    //Felder
    @Id
    @GeneratedValue
    private String adressID;

    private String street;

    private String houseNo;

    private String zipCode;

    private String state;

    private String country;

    //Getter & Setter
    public String getAdressID() { return adressID; }

    public void setAdressID(String adressID) { this.adressID = adressID; }

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }

    public String getHouseNo() { return houseNo; }

    public void setHouseNo(String houseNo) { this.houseNo = houseNo; }

    public String getZipCode() { return zipCode; }

    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    //Konstruktoren
    public Adress(String street, String houseNo, String zipCode, String state, String country) {
        this.street = street;
        this.houseNo = houseNo;
        this.zipCode = zipCode;
        this.state = state;
        this.country = country;
    }

    public Adress() {

    }

    //Override Methoden toString, equals, hashCode
    @Override
    public String toString() {
        return "Adress{" +
                "adressID='" + adressID + '\'' +
                ", street='" + street + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adress)) return false;
        Adress adress = (Adress) o;
        return Objects.equals(getAdressID(), adress.getAdressID()) &&
                Objects.equals(getStreet(), adress.getStreet()) &&
                Objects.equals(getHouseNo(), adress.getHouseNo()) &&
                Objects.equals(getZipCode(), adress.getZipCode()) &&
                Objects.equals(getState(), adress.getState()) &&
                Objects.equals(getCountry(), adress.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAdressID(), getStreet(), getHouseNo(), getZipCode(), getState(), getCountry());
    }
}