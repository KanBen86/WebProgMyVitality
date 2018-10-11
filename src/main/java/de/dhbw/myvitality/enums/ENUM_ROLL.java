package de.dhbw.myvitality.enums;

public enum ENUM_ROLL {
    ADMIN("Administrator", "Administrator der alle Aktionen im Programm ausführen darf"), USER("Benutzer", "Standardbenutzer mit eingeschränkten Rechten");

    private String name;
    private String description;

    ENUM_ROLL(String name, String description) {
        this.name = name;
        this.description = description;
    }
}