package com.nail.shop.models;

public enum Gender {
    MALE(1,"Male"),
    FEMALE(2,"Female");

    private final Integer value;
    private final String label;

    Gender(Integer value, String label) {
        this.value = value;
        this.label = label;
    }

    public Integer getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }
}
