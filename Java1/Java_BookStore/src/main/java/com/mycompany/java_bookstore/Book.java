package com.mycompany.java_bookstore;

public class Book {
    
    int id;
    String isbn;
    String name;
    Author author;
    
    Book(){
    }    

    Book(int pId, String pIsbn, String pName, Author pAuthor){
        this.id = pId;
        this.isbn = pIsbn;
        this.name = pName;
        this.author = pAuthor;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
}
