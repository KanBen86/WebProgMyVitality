package de.dhbw.myvitality.enums;

public enum ENUM_INGREDIENTS {

    Salpetersäure("E365", "Salpetersäure"), Bananenpulver("E453", "Bananenpulver"),
    Teufelskralle("E666", "Teufelskralle");
    private String number;
    private String description;

    ENUM_INGREDIENTS(String number, String description) {
        this.number = number;
        this.description = description;
    }
}
