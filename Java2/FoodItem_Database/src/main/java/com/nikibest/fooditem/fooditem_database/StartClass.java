package com.nikibest.fooditem.fooditem_database;

import java.sql.ResultSet;

public class StartClass {
     public static void main(String[] args) {
        System.out.println("ran");
        FoodItem.CreateTable();
        FoodItem.InsertItem(1,"Cookie",100);
        FoodItem.InsertItem(2,"Soup",150);
        FoodItem.InsertItem(3,"Crackers",120);
        FoodItem.InsertItem(4,"Candy Bar",250);
        FoodItem.InsertItem(5,"Apple",30);
        FoodItem.InsertItem(6,"Banana",105);
        try {
            ResultSet aResultSet = FoodItem.GetItems();
            while (aResultSet.next()) {
                System.out.println("The ID: " + aResultSet.getInt("ID"));
                System.out.println("Name: " + aResultSet.getString("Name"));
                System.out.println("Calories: " + aResultSet.getInt("Calories"));
            }
        } catch (Exception e) {
            
        }
     }
    
}
