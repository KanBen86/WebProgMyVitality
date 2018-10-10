package de.dhbw.myvitality.entities;

import javax.persistence.*;

@Entity
public class Storrage {

    @Id
    @GeneratedValue
    private String storrageId;

    @OneToOne
    @JoinColumn(name = "storrage_id")
    private Article article;

    private char rackSector;

    private char rackcorridor;

    private byte level;

    public Storrage() {
    }

    public Storrage(Article article, char rackSector, char rackcorridor, byte level) {
        this.article = article;
        this.rackSector = rackSector;
        this.rackcorridor = rackcorridor;
        this.level = level;
    }

    public String getStorrageId() {
        return storrageId;
    }

    public void setStorrageId(String storrageId) {
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
