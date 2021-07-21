package com.company;

public enum RestaurantMenu {

    APPETIZER("Streamed Prawns", "Cafe latte"),
    MAIN_COURSE("Continental Rise", "Deep Fried Chicken"),
    DESERT("Cupcakes", "Milk chocolate ice cream");

    private final String firstItem;
    private final String secondItem;

    RestaurantMenu(String firstItem, String secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public String getFirstItem() {
        return firstItem;
    }

    public String getSecondItem() {
        return secondItem;
    }
}
