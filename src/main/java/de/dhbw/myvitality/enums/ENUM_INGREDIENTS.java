package de.dhbw.myvitality.enums;

public enum ENUM_INGREDIENTS {

    ZUSATZSTOFF_EINS("E365", "Salpetersäure");
    private String number;
    private String description;

    ENUM_INGREDIENTS(String number, String description) {
        this.number = number;
        this.description = description;
    }
}
