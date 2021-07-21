package com.company;

public class RestaurantMenuImpl {
    public static void main(String[] args) {
        RestaurantMenu appetizer = RestaurantMenu.APPETIZER;
        RestaurantMenu mainCourse = RestaurantMenu.MAIN_COURSE;
        RestaurantMenu desert = RestaurantMenu.DESERT;
        System.out.println("The first dish of " + appetizer + " is " + appetizer.getFirstItem());
        System.out.println("The first dish of " + mainCourse + " is " + mainCourse.getFirstItem());
        System.out.println("The first dish of " + desert + " is " + desert.getFirstItem());
    }
}
