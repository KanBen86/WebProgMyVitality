package de.dhbw.myvitality.entities;

import javax.persistence.*;

@Entity
public class Position {

    @Id
    @GeneratedValue
    private String positionId;

    @OneToOne
    @JoinColumn(name = "position_article_id")
    private Article article;

    private int amount;

    public Position(Article article, int amount) {
        this.article = article;
        this.amount = amount;
    }

    public Position() {
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
