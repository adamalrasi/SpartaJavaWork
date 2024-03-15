package com.sparta.aa.enums;

public enum Size {
    SMALL("Small Pizza"),
    MEDIUM("Medium Pizza"),
    LARGE("Large Pizza");

    private String description;

    Size(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
