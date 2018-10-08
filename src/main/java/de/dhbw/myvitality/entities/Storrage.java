package de.dhbw.myvitality.entities;

import javax.persistence.*;


@Entity
@Table
public class Storrage {

    @MapsId()
    @OneToOne(fetch = FetchType.LAZY)
    private String articleId;

    @Column
    private int articleAmount;

    @Column
    private char rackSector;

    @Column
    private int rackLevel;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
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
