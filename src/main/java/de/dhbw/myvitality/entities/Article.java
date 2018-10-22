package de.dhbw.myvitality.entities;

import de.dhbw.myvitality.enums.ENUM_ALLERGEN;
import de.dhbw.myvitality.enums.ENUM_INGREDIENTS;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Benjamin Kanzler
 */
@Entity
public class Article {

    //Felder der Klasse

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String articleId;

    private String description;

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

    public Article(String description, ArrayList<ENUM_INGREDIENTS> ingredients, int barcode, float price, Company supplier, ArrayList<ENUM_ALLERGEN> allergens) {
        this.description = description;
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
                "articleId='" + articleId +
                ", description='" + description +
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
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return getBarcode() == article.getBarcode() &&
                Float.compare(article.getPrice(), getPrice()) == 0 &&
                Objects.equals(getArticleId(), article.getArticleId()) &&
                Objects.equals(getDescription(), article.getDescription()) &&
                Objects.equals(getIngredients(), article.getIngredients()) &&
                Objects.equals(getSupplier(), article.getSupplier()) &&
                Objects.equals(getAllergens(), article.getAllergens());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArticleId(), getDescription(), getIngredients(), getBarcode(), getPrice(), getSupplier(), getAllergens());
    }
}
