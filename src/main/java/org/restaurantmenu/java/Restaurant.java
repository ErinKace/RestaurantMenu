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

        MenuItem[] startingList = {cheesePizza, frenchFries, chocolateCake};
        ArrayList<MenuItem> startingMenu = new ArrayList<>(List.of(startingList));
        Menu mainRestaurantMenu = new Menu(startingMenu);
        mainRestaurantMenu.printMenu();
        mainRestaurantMenu.getMenuItem(0).printMenuItem();
        mainRestaurantMenu.removeMenuItem("French Fries");
        mainRestaurantMenu.printMenu();

    }



}
