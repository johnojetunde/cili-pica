package com.cilipica.domain.enums;

public enum OrderStatus {
    PLACED("placed"),

    APPROVED("approved"),

    DELIVERED("delivered");

    private String value;

    OrderStatus(String value) {
        this.value = value;
    }

    public static OrderStatus fromValue(String text) {
        for (OrderStatus b : OrderStatus.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
