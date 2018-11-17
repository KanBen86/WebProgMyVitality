package de.dhbw.myvitality.entities;

import de.dhbw.myvitality.enums.ENUM_ALLERGEN;
import de.dhbw.myvitality.enums.ENUM_INGREDIENTS;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Benjamin Kanzler
 */
@Entity
public class Article implements Serializable {

    //Felder der Klasse

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String articleId;

    private String description;

    private String information;

    private String ingredients;

    private int barcode;

    private float price;

    @OneToOne
    @JoinColumn(name = "article_supplier_id")
    private Company supplier;

    @Transient //TODO
    private ArrayList<ENUM_ALLERGEN> allergens;

    @OneToOne()
    @JoinColumn()
    private Storrage storrage;

    //Konstruktoren

    public Article() {
    }

    public Article(String description, String information,
                   String ingredients, int barcode, float price,
                   Company supplier, ArrayList<ENUM_ALLERGEN> allergens, Storrage storrage) {
        this.description = description;
        this.information = information;
        this.ingredients = ingredients;
        this.barcode = barcode;
        this.price = price;
        this.supplier = supplier;
        this.allergens = allergens;
        this.storrage = storrage;
    }


    //Getter & Setter


    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Company getSupplier() {
        return supplier;
    }

    public void setSupplier(Company supplier) {
        this.supplier = supplier;
    }

    public ArrayList<ENUM_ALLERGEN> getAllergens() {
        return allergens;
    }

    public void setAllergens(ArrayList<ENUM_ALLERGEN> allergens) {
        this.allergens = allergens;
    }

    public Storrage getStorrage() {
        return storrage;
    }

    public void setStorrage(Storrage storrage) {
        this.storrage = storrage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return barcode == article.barcode &&
                Float.compare(article.price, price) == 0 &&
                Objects.equals(articleId, article.articleId) &&
                Objects.equals(description, article.description) &&
                Objects.equals(information, article.information) &&
                Objects.equals(ingredients, article.ingredients) &&
                Objects.equals(supplier, article.supplier) &&
                Objects.equals(allergens, article.allergens) &&
                Objects.equals(storrage, article.storrage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, description, information, ingredients, barcode, price, supplier, allergens, storrage);
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId='" + articleId + '\'' +
                ", description='" + description + '\'' +
                ", information='" + information + '\'' +
                ", ingredients=" + ingredients +
                ", barcode=" + barcode +
                ", price=" + price +
                ", supplier=" + supplier +
                ", allergens=" + allergens +
                ", storrage=" + storrage +
                '}';
    }
}
