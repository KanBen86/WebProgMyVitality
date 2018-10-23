package de.dhbw.myvitality.entities;


import javax.persistence.*;

/**
 * Entityklasse für das Unternehmen
 * @author Fabian Lieb
 */
@Entity
public class Company {

    //Felder der Klasse

    @Id
    @GeneratedValue
    private String company_Id;

    private String name;

    private String article_Id;

    @Transient // TODO
    private Adress addresse;

    @OneToOne
    @JoinColumn(name = "company_contract_id")
    private Contract contract;

    @Transient //TODO
    private Person contactPerson;

    //Konstruktoren

    public Company(String name, Adress addresse, Contract contract, Person contactPerson) {
        this.name = name;
        this.addresse = addresse;
        this.contract = contract;
        this.contactPerson = contactPerson;
    }

    //Getter & Setter

    public String getCompany_Id() {
        return company_Id;
    }

    public void setCompany_Id(String company_Id) {
        this.company_Id = company_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle_Id() {
        return article_Id;
    }

    public void setArticle_Id(String article_Id) {
        this.article_Id = article_Id;
    }

    public Adress getAddresse() {
        return addresse;
    }

    public void setAddresse(Adress addresse) {
        this.addresse = addresse;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Person getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(Person contactPerson) {
        this.contactPerson = contactPerson;
    }
}
