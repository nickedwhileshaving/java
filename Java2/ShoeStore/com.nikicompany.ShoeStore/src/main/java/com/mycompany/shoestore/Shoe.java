package com.mycompany.shoestore;

import java.util.ArrayList;

public class Shoe {
    
    String name;
    int size;  
    String model;
    
    Shoe(){
        
    }
    
    Shoe(String pName, int pSize, String pModel){
        this.name = pName;
        this.size = pSize;
        this.model = pModel;
    }    
    public static ArrayList getShoeNameTypes(){
        ArrayList anArrayList = new ArrayList();
        anArrayList.add("Nike");
        anArrayList.add("ASICS");
        anArrayList.add("Adidas");
        anArrayList.add("Saucony");
        anArrayList.add("Brooks");
        return anArrayList;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
