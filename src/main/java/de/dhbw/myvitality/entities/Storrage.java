package de.dhbw.myvitality.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Storrage implements Serializable {

    @Id
    @GeneratedValue
    private long storrageId;

    private char rackSector;

    private char rackcorridor;

    private byte level;

    private int amount;

    public Storrage() {
    }

    public Storrage(char rackSector, char rackcorridor, byte level) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storrage storrage = (Storrage) o;
        return storrageId == storrage.storrageId &&
                rackSector == storrage.rackSector &&
                rackcorridor == storrage.rackcorridor &&
                level == storrage.level &&
                amount == storrage.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(storrageId, rackSector, rackcorridor, level, amount);
    }

    @Override
    public String toString() {
        return "Storrage{" +
                "storrageId=" + storrageId +
                ", rackSector=" + rackSector +
                ", rackcorridor=" + rackcorridor +
                ", level=" + level +
                ", amount=" + amount +
                '}';
    }
}
