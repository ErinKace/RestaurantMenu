package org.restaurantmenu.java;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
     private ArrayList<MenuItem> menuItems = new ArrayList<>();
     private Date dateLastUpdated;
     public Menu() {
         this.dateLastUpdated = new Date();
     }
     public Menu(ArrayList<MenuItem> newMenuList) {
         this.menuItems = newMenuList;
         this.dateLastUpdated = new Date();
     }

     public ArrayList<MenuItem> getMenuItems() {
         return this.menuItems;
     }
     public Date getDateLastUpdated() {
         return this.dateLastUpdated;
     }
     public void addMenuItem(MenuItem newMenuItem) {
         this.menuItems.add(newMenuItem);
         this.dateLastUpdated = new Date();
     }
     public void removeMenuItem(String itemToRemove) {
         MenuItem objectToRemove;
         for (MenuItem item : this.menuItems) {
             if (item.getName().equals(itemToRemove)) {
                 objectToRemove = item;
                 int itemIndex = this.menuItems.indexOf(objectToRemove);
                 this.menuItems.remove(itemIndex);
             } else {
                 System.out.println("Item not found");
             }
         }
     }
     private void setDateLastUpdated() {
         this.dateLastUpdated = new Date();
     }
}
