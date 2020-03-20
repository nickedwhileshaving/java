package com.mycompany.shoestore;

import java.util.ArrayList;

public class ShoeStore {
    
    String id;
    String name;
    String address;
    boolean hasACafe;
    ArrayList<Shoe> shoeArrayList;
    
    ShoeStore(){
        populateInventory();
    }

    public ArrayList<Shoe> getShoeList() {
        return shoeArrayList;
    }

    public void populateInventory(){
        shoeArrayList = new ArrayList();
        int theRemainder;
        for(int i=1; i <= 1000; i++){
            theRemainder = i % 5;
            String aNewString = (String)Shoe.getShoeNameTypes().get(theRemainder);
            Shoe aShoe = new Shoe(aNewString, i , aNewString + " Model");
            shoeArrayList.add(aShoe);
        }       
    }
}
