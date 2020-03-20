package com.mycompany.java_bookstore;

import java.util.ArrayList;

public class BookStore {
    
    String id;
    String name;
    String address;
    boolean hasACafe;
    ArrayList<Book> bookArrayList;
    
    BookStore(){
        populateInventory();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isHasACafe() {
        return hasACafe;
    }

    public void setHasACafe(boolean hasACafe) {
        this.hasACafe = hasACafe;
    }

    public ArrayList<Book> getBookList() {
        return bookArrayList;
    }

    public void populateInventory(){
        bookArrayList = new ArrayList();
        for(int i=1; i <= 1000; i++){
            bookArrayList.add(new Book(i, String.valueOf(i), "Book Name " + String.valueOf(i), 
                new Author(i, "First Name " + String.valueOf(i), "Last Name " + String.valueOf(i),i)));            
        }        
    }
}
