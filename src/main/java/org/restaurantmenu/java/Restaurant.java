package org.restaurantmenu.java;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem cheesePizza = new MenuItem("Cheese Pizza",
                12.00,
                "Main Course",
                "A super delicious cheesy pizza. I am so hungry.");
        MenuItem frenchFries = new MenuItem("French Fries",
                6.00,
                "Appetizer",
                "Hand fried with our special seasoning blend.");
        MenuItem chocolateCake = new MenuItem("Chocolate Cake",
                6.00,
                "Dessert",
                "Five layer cake with chocolate fudge frosting, chocolate ganache, served with a scoop of vanilla ice cream.");
        MenuItem grilledCheese = new MenuItem("Grilled Cheese",
                8.00,
                "Main Course",
                "Deliciously toasted sourdough bread with melty white cheddar cheese.");
        MenuItem tomatoSoup = new MenuItem("Tomato Soup",
                6.00,
                "Soup",
                "Creamy tomato basil soup with thyme and onion.");
        MenuItem cheesePlate = new MenuItem("Cheese Plate",
                12.00,
                "Appetizer",
                "A plate of honey goat cheese, chive and onion goat cheese, extra sharp white cheddar, brie, and gouda slices. Served with crackers and fresh fruit.");
        MenuItem cheeseCake = new MenuItem( "Vanilla Cheese Cake",
                7.00,
                "Dessert",
                "Decadent vanilla cheesecake with a graham cracker crust and a layer of chocolate ganache on top. Served with fresh strawberries.");

        MenuItem[] startingList = {cheesePizza, frenchFries, chocolateCake, grilledCheese, tomatoSoup, cheesePlate, cheeseCake};
        ArrayList<MenuItem> startingMenu = new ArrayList<>(List.of(startingList));
        Menu mainRestaurantMenu = new Menu("Cheese Please Menu", startingMenu);
        System.out.println(mainRestaurantMenu);
        System.out.println(mainRestaurantMenu.getMenuItem(0));

//        mainRestaurantMenu.removeMenuItem("French Fries");
//        System.out.println(mainRestaurantMenu);

    }



}
