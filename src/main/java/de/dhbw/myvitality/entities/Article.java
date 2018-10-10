package de.dhbw.myvitality.entities;

import de.dhbw.myvitality.enums.ENUM_ALLERGEN;
import de.dhbw.myvitality.enums.ENUM_INGREDIENTS;

import javax.persistence.*;
import java.util.List;
@Entity
public class Article {

    @Id
    @GeneratedValue()
    private String articleId;

    private String description;

    @Transient
    private List<ENUM_INGREDIENTS> ingredients;

    private int barcode;

    private float price;

    @OneToOne
    @JoinColumn(name = "article_id")
    private Company supplier;

    @Transient //TODO
    private List<ENUM_ALLERGEN> allergens;

    public Article() {
    }

    public Article(String articleId, String description, List<ENUM_INGREDIENTS> ingredients, int barcode, float price, Company supplier, List<ENUM_ALLERGEN> allergens) {
        this.articleId = articleId;
        this.description = description;
        this.ingredients = ingredients;
        this.barcode = barcode;
        this.price = price;
        this.supplier = supplier;
        this.allergens = allergens;
    }

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

    public void setIngredients(List<ENUM_INGREDIENTS> ingredients) {
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

    public void setAllergens(List<ENUM_ALLERGEN> allergens) {
        this.allergens = allergens;
    }
}
