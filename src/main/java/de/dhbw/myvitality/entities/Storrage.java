package de.dhbw.myvitality.entities;

import javax.persistence.*;


@Entity
@Table
public class Storrage {

    @MapsId()
    @JoinColumn(name = "articleId")
    @OneToOne(fetch = FetchType.LAZY)
    private Article articleId;

    @Column
    private int articleAmount;

    @Column
    private char rackSector;

    @Column
    private int rackLevel;

    public Storrage(){

    }

    public Storrage(Article articleId, int articleAmount, char rackSector, int rackLevel) {
        this.articleId = articleId;
        this.articleAmount = articleAmount;
        this.rackSector = rackSector;
        this.rackLevel = rackLevel;
    }

    public Article getArticleId() {
        return articleId;
    }

    public void setArticleId(Article articleId) {
        this.articleId = articleId;
    }

    public int getArticleAmount() {
        return articleAmount;
    }

    public void setArticleAmount(int articleAmount) {
        this.articleAmount = articleAmount;
    }

    public char getRackSector() {
        return rackSector;
    }

    public void setRackSector(char rackSector) {
        this.rackSector = rackSector;
    }

    public int getRackLevel() {
        return rackLevel;
    }

    public void setRackLevel(int rackLevel) {
        this.rackLevel = rackLevel;
    }
}
