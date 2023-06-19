package org.restaurantmenu.java;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class MenuItem {
    private final int DAYS_NEW = 30;
     private String name;
     private Double price;
     private String category;
     private String description;

     private LocalDate dateAdded = LocalDate.now();

     public MenuItem(String aName, Double aPrice, String aCategory, String aDescription) {
         this.name = aName;
         this.price = aPrice;
         this.category = aCategory;
         this.description = aDescription;
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
     public boolean checkIfNew() {
         LocalDate today = LocalDate.now();
         long datesBetween = ChronoUnit.DAYS.between(dateAdded,today);
         if (datesBetween > DAYS_NEW) {
             return false;
         } else {
             return true;
         }
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name) && Objects.equals(price, menuItem.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
    @Override
    public String toString() {
         String returnStr = name;
         if (checkIfNew()) {
             returnStr = "*NEW* "+returnStr;
         }
         returnStr += " - $" + price;
         returnStr += "\n(" + category + ") ";
         returnStr += "\n"+description;
         return returnStr;
    }
}
