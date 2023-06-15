package org.restaurantmenu.java;

import java.time.LocalDate;
import java.util.ArrayList;



public class Menu {
     private ArrayList<MenuItem> menuItems = new ArrayList<>();
     private LocalDate dateLastUpdated = LocalDate.now();
     public Menu() {
     }
     public Menu(ArrayList<MenuItem> newMenuList) {
         this.menuItems = newMenuList;
         this.dateLastUpdated = LocalDate.now();
     }

     public ArrayList<MenuItem> getMenuItems() {
         return this.menuItems;
     }
     public LocalDate getDateLastUpdated() {
         return this.dateLastUpdated;
     }
    private void setDateLastUpdated() {
        this.dateLastUpdated = LocalDate.now();
    }
     public void addMenuItem(MenuItem newMenuItem) {
         this.menuItems.add(newMenuItem);
         setDateLastUpdated();
     }
     public void removeMenuItem(String itemToRemove) {
         MenuItem objectToRemove;
         for (MenuItem item : this.menuItems) {
             if (item.getName().equals(itemToRemove)) {
                 objectToRemove = item;
                 int itemIndex = this.menuItems.indexOf(objectToRemove);
                 this.menuItems.remove(itemIndex);
                 setDateLastUpdated();
             } else {
                 System.out.println("Item not found");
             }
         }
     }
     public void printMenu() {
         for (MenuItem item : menuItems) {
             System.out.println(item.toString());
         }
     }

}
