package de.dhbw.myvitality.entities;


import javax.persistence.*;

public class Company {

    private String company_Id;

    private String name;

    private String article_Id;

    private Address addresse;

    private Contract contract;

    private Person contactPerson;

    public Company(String name, Address addresse, Contract contract, Person contactPerson) {
        this.name = name;
        this.addresse = addresse;
        this.contract = contract;
        this.contactPerson = contactPerson;
    }

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

    public Address getAddresse() {
        return addresse;
    }

    public void setAddresse(Address addresse) {
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
