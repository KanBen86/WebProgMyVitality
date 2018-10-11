package de.dhbw.myvitality.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

/***
 * Entityklasse für eine Bank
 * @author tamino.fischer
 */
@Entity
public class Bank {
    //Felder
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String bankId;

    private String iban;

    private String bic;

    private String depositor;

    private String institute;

    //Getter & Setter
    public String getBankId() { return bankId; }

    public void setBankId(String bankId) { this.bankId = bankId; }

    public String getIban() { return iban; }

    public void setIban(String iban) { this.iban = iban; }

    public String getBic() { return bic; }

    public void setBic(String bic) { this.bic = bic; }

    public String getDepositor() { return depositor; }

    public void setDepositor(String depositor) { this.depositor = depositor; }

    public String getInstitute() { return institute; }

    public void setInstitute(String institute) { this.institute = institute; }

    //Konsutuktoren

    public Bank(String iban, String bic, String depositor, String institute) {
        this.iban = iban;
        this.bic = bic;
        this.depositor = depositor;
        this.institute = institute;
    }

    public Bank(){

    }

    //Override Methoden toString, hashCode, equals

    @Override
    public String toString() {
        return "Bank{" +
                "bankId='" + bankId + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", depositor='" + depositor + '\'' +
                ", institute='" + institute + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank)) return false;
        Bank bank = (Bank) o;
        return Objects.equals(getBankId(), bank.getBankId()) &&
                Objects.equals(getIban(), bank.getIban()) &&
                Objects.equals(getBic(), bank.getBic()) &&
                Objects.equals(getDepositor(), bank.getDepositor()) &&
                Objects.equals(getInstitute(), bank.getInstitute());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBankId(), getIban(), getBic(), getDepositor(), getInstitute());
    }
}
