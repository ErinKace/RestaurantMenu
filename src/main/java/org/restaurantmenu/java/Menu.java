package org.restaurantmenu.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;


public class Menu {
    private String menuTitle;
     private ArrayList<MenuItem> menuItems = new ArrayList<>();
     private LocalDate dateLastUpdated = LocalDate.now();
     public Menu(String aMenuTitle) {
         this.menuTitle = aMenuTitle;
     }
     public Menu(String aMenuTitle, ArrayList<MenuItem> newMenuList) {
         this.menuTitle = aMenuTitle;
         this.menuItems = newMenuList;
     }
     public String getMenuTitle() {
         return menuTitle;
     }

     public ArrayList<MenuItem> getMenuItems() {
         return menuItems;
     }
     public MenuItem getMenuItem(int index) {
         return menuItems.get(index);
     }
     public LocalDate getDateLastUpdated() {
         return dateLastUpdated;
     }
    private void setDateLastUpdated() {
        dateLastUpdated = LocalDate.now();
    }
     public void addMenuItem(MenuItem newMenuItem) {
         if (!menuItems.contains(newMenuItem)) {
             menuItems.add(newMenuItem);
             setDateLastUpdated();
         }
     }
     public void removeMenuItem(String itemToRemove) {
         MenuItem objectToRemove = null;
         for (MenuItem item : this.menuItems) {
             if (item.getName().equals(itemToRemove)) {
                 objectToRemove = item;
                 int itemIndex = this.menuItems.indexOf(objectToRemove);
                 this.menuItems.remove(itemIndex);
                 setDateLastUpdated();
             }
         }
         if (objectToRemove == null) {
             System.out.println("Item Not Found");
         }
     }
     public void sortByCategory() {
         menuItems.sort((m1, m2)
                 -> m1.getCategory().compareTo(m2.getCategory()));
     }
     public void sortByCategoryAndPrice() {
         Comparator<MenuItem> sortByCategoryAndPrice
                 = Comparator.comparing(MenuItem :: getCategory).thenComparing(MenuItem :: getPrice);
         menuItems.sort(sortByCategoryAndPrice);
     }


    @Override
    public String toString() {
         this.sortByCategoryAndPrice();
        String returnStr = menuTitle+"\n";
        returnStr += "\nDate Last Updated: "+dateLastUpdated+"\n";

        for (MenuItem item : menuItems) {
            returnStr += "\n"+item.toString()+"\n";
        }
        return returnStr;
    }
}
