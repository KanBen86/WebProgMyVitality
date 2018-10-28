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

    @Transient
    private ArrayList<ENUM_INGREDIENTS> ingredients;

    private int barcode;

    private float price;

    @OneToOne
    @JoinColumn(name = "article_supplier_id")
    private Company supplier;

    @Transient //TODO
    private ArrayList<ENUM_ALLERGEN> allergens;

    //Konstruktoren

    public Article() {
    }

    public Article(String description, String information, ArrayList<ENUM_INGREDIENTS> ingredients, int barcode, float price, Company supplier, ArrayList<ENUM_ALLERGEN> allergens) {
        this.description = description;
        this.information = information;
        this.ingredients = ingredients;
        this.barcode = barcode;
        this.price = price;
        this.supplier = supplier;
        this.allergens = allergens;
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

    public List<ENUM_INGREDIENTS> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<ENUM_INGREDIENTS> ingredients) {
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

    public List<ENUM_ALLERGEN> getAllergens() {
        return allergens;
    }

    public void setAllergens(ArrayList<ENUM_ALLERGEN> allergens) {
        this.allergens = allergens;
    }

    //Override Methoden toString, hashCode, equals


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
                '}';
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
                Objects.equals(allergens, article.allergens);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, description, information, ingredients, barcode, price, supplier, allergens);
    }
}
