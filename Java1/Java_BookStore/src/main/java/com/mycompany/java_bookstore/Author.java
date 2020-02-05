package com.mycompany.java_bookstore;

public class Author {
    
    int id;
    String firstName;
    String lastName;
    int numberOfBooksWritten;
    
    Author(){
    }    
    
    Author(int pId, String pFirstName, String pLastName,
            int pNumberOfBooksWritten){
        this.id = pId;
        this.firstName = pFirstName;
        this.lastName = pLastName;
        this.numberOfBooksWritten = pNumberOfBooksWritten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfBooksWritten() {
        return numberOfBooksWritten;
    }

    public void setNumberOfBooksWritten(int numberOfBooksWritten) {
        this.numberOfBooksWritten = numberOfBooksWritten;
    }
    
}
