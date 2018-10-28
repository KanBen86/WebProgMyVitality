package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Storrage implements Serializable {

    @Id
    @GeneratedValue
    private long storrageId;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @MapsId("articleId")
    @JoinColumn(name = "article_storrage_id")
    private Article article;

    private char rackSector;

    private char rackcorridor;

    private byte level;

    private int amount;

    public Storrage() {
    }

    public Storrage(Article article, char rackSector, char rackcorridor, byte level) {
        this.article = article;
        this.rackSector = rackSector;
        this.rackcorridor = rackcorridor;
        this.level = level;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public char getRackSector() {
        return rackSector;
    }

    public void setRackSector(char rackSector) {
        this.rackSector = rackSector;
    }

    public char getRackcorridor() {
        return rackcorridor;
    }

    public void setRackcorridor(char rackcorridor) {
        this.rackcorridor = rackcorridor;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Storrage{" +
                "article=" + article +
                ", rackSector=" + rackSector +
                ", rackcorridor=" + rackcorridor +
                ", level=" + level +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storrage storrage = (Storrage) o;
        return  rackSector == storrage.rackSector &&
                rackcorridor == storrage.rackcorridor &&
                level == storrage.level &&
                amount == storrage.amount &&
                Objects.equals(article, storrage.article);
    }

    @Override
    public int hashCode() {
        return Objects.hash(article, rackSector, rackcorridor, level, amount);
    }
}
