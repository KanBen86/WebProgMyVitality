package de.dhbw.myvitality.enums;

public enum ENUM_ROLL {
    ADMIN("Administrator", "The Administrator can do anything");

    private String name;
    private String description;

    ENUM_ROLL(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
