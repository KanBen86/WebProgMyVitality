package de.dhbw.myvitality.entities;

import javax.persistence.*;

@Entity
public class Storrage {

    @Id
    @GeneratedValue
    private long storrageId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "storrage_article_id")
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

    public long getStorrageId() {
        return storrageId;
    }

    public void setStorrageId(long storrageId) {
        this.storrageId = storrageId;
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
}
