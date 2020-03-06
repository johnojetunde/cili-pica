package com.cilipica.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MealStatus {
    AVAILABLE("available"),

    SOLDOUT("soldout");

    private String value;

    MealStatus(String value) {
        this.value = value;
    }

    @JsonCreator
    public static MealStatus fromValue(String text) {
        for (MealStatus b : MealStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }
}
