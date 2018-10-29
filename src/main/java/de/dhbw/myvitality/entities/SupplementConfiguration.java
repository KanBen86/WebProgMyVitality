package de.dhbw.myvitality.entities;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/***
 * Entityklasse für die SupplementConfig
 * In dieser Datenklasse wird die "individuelle Mischung an Nahrungsergänzungsmitteln für die jeweilige Person gespeichert"
 * @author tamino.fischer
 */
@Entity
public class SupplementConfiguration {

    //Felder

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String suppsId;

    @ElementCollection(fetch=FetchType.EAGER)
    @CollectionTable(name="listOfArticles")
    private List<Article> articleList;


    @ElementCollection
    private List<Double> quantitList;

    @ElementCollection
    private List<String> informationList;

    private String customerId;

    //Getter & Setter

    public String getSuppsId() {
        return suppsId;
    }

    public void setSuppsId(String suppsId) {
        this.suppsId = suppsId;
    }

    public List<Double> getQuantitList() {
        return quantitList;
    }

    public void setQuantitList(List<Double> quantitList) {
        this.quantitList = quantitList;
    }

    public List<String> getInformationList() {
        return informationList;
    }

    public void setInformationList(List<String> informationList) {
        this.informationList = informationList;
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    //Konstruktoren

    public SupplementConfiguration(List<Article> articleList, List<Double> quantitList, List<String> informationList ,String customerId) {
        this.articleList = articleList;
        this.quantitList = quantitList;
        this.informationList = informationList;
        this.customerId = customerId;
    }

    public SupplementConfiguration(){

    }

    //Override Methoden toString, equals, hashCode


    @Override
    public String toString() {
        return "SupplementConfiguration{" +
                "suppsId='" + suppsId + '\'' +
                ", articleList=" + articleList +
                ", customerId='" + customerId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SupplementConfiguration)) return false;
        SupplementConfiguration that = (SupplementConfiguration) o;
        return Objects.equals(getSuppsId(), that.getSuppsId()) &&
                Objects.equals(getArticleList(), that.getArticleList()) &&
                Objects.equals(getQuantitList(), that.getQuantitList()) &&
                Objects.equals(getInformationList(), that.getInformationList()) &&
                Objects.equals(getCustomerId(), that.getCustomerId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSuppsId(), getArticleList(), getQuantitList(), getInformationList(), getCustomerId());
    }
}
