package org.restaurantmenu.java;

public class MenuItem {

     private String name;
     private Double price;
     private String category;
     private String description;
     private boolean newItem;

     public MenuItem(String aName, Double aPrice, String aCategory, String aDescription) {
         this.name = aName;
         this.price = aPrice;
         this.category = aCategory;
         this.description = aDescription;
         this.newItem = true;
     }
     public String getName() {
         return this.name;
     }
     public Double getPrice() {
         return this.price;
     }
     public String getCategory() {
         return this.category;
     }
     public String getDescription() {
         return this.description;
     }
     public boolean getNewItem() {
         return this.newItem;
     }
     private void setName(String newName) {
         this.name = newName;
     }
     private void setPrice(Double newPrice) {
         this.price = newPrice;
     }
     public void setCategory(String newCategory) {
         this.category = newCategory;
     }
     public void setDescription(String newDescription) {
         this.description = newDescription;
     }
     public void setNewItem() {
         this.newItem = false;
     }
}
