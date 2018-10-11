package de.dhbw.myvitality.entities;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
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

    private ArrayList<Article> articleList;

    //Getter & Setter

    public String getSuppsId() {
        return suppsId;
    }

    public void setSuppsId(String suppsId) {
        this.suppsId = suppsId;
    }

    public ArrayList<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(ArrayList<Article> articleList) {
        this.articleList = articleList;
    }

    //Override Methoden toString, equals, hashCode

    @Override
    public String toString() {
        return "SupplementConfiguration{" +
                "suppsId='" + suppsId + '\'' +
                ", articleList=" + articleList +
                '}';
    }

    //Konstruktoren

    public SupplementConfiguration(ArrayList<Article> articleList) {
        this.articleList = articleList;
    }

    public SupplementConfiguration(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SupplementConfiguration)) return false;
        SupplementConfiguration that = (SupplementConfiguration) o;
        return Objects.equals(getSuppsId(), that.getSuppsId()) &&
                Objects.equals(getArticleList(), that.getArticleList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSuppsId(), getArticleList());
    }
}
