package com.mycompany.java_bookstore;
 
import java.io.*; 
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        BookStore aBookStore = new BookStore();
        printEmptyLines();
        System.out.println("Welcome to Niki's Book Store.");
        presentUserPrompt();
        while(true){
            Scanner input = new Scanner(System.in);
            String aString = input.nextLine();
            if ("3".equals(aString)){
                break;
            } if ("2". equals(aString)){
                System.out.println("Here are the books.");
                for (Book aBook : aBookStore.getBookList()) { 		   
                    System.out.println("------------------------------------------");
                    System.out.println("ID: " + aBook.getId()); 		
                    System.out.println("Name: " + aBook.getName());
                    System.out.println("ISBN: " + aBook.getIsbn());
                    System.out.println("\tAuthor");
                    System.out.println("\tID: " + aBook.getAuthor().getId());
                    System.out.println("\tFirst Name: " + aBook.getAuthor().getFirstName());
                    System.out.println("\tLast Name: " + aBook.getAuthor().getLastName());
                    System.out.println("\tNumber Of Books: " + aBook.getAuthor().getNumberOfBooksWritten());
                    System.out.println("------------------------------------------");
                }
                //getBookList
            } if ("1".equals(aString)){
                System.out.print("Enter an ISBN: ");
                Scanner anotherInput = new Scanner(System.in);
                String anotherString = anotherInput.nextLine();  
                printEmptyLines();
                boolean isBookHere = false;
                for (Book aBook : aBookStore.getBookList()) { 
                    if(aBook.getIsbn().equals(anotherString)){
                        System.out.println("Here is your book: ");
                        System.out.println("------------------------------------------");
                        System.out.println("ID: " + aBook.getId()); 		
                        System.out.println("Name: " + aBook.getName());
                        System.out.println("ISBN: " + aBook.getIsbn());
                        System.out.println("\tAuthor");
                        System.out.println("\tID: " + aBook.getAuthor().getId());
                        System.out.println("\tFirst Name: " + aBook.getAuthor().getFirstName());
                        System.out.println("\tLast Name: " + aBook.getAuthor().getLastName());
                        System.out.println("\tNumber Of Books: " + aBook.getAuthor().getNumberOfBooksWritten());
                        System.out.println("------------------------------------------"); 
                        isBookHere = true;
                        break;
                    }
                }
                if (!isBookHere){
                    System.out.println("Your book is not here.");
                }
                break;                
            } else {
                printEmptyLines();  
                presentUserPrompt();
            }
        }
    } 
    public static void theStandardDelayedMessage(String theMessage) {
        System.out.println(theMessage);
        try {
            Thread.sleep(3000);
        } catch ( Exception e) {

        }        
    }
    public static void yourBalanceIsBeingUpdated() {
        System.out.print("Your balance is being updated.");
        try {
            for (int i=0; i < 10; i++){            
                Thread.sleep(500);
                System.out.print(".");
            }
        } catch ( Exception e) {
        }    
        //theStandardDelayedMessage("");
    }
    public static void printEmptyLines(){
        for (int i=0; i<1000; i++){
            System.out.println();
        }
    }
    public static void presentUserPrompt(){
        System.out.println("(1) Lookup a book");
        System.out.println("(2) Show all books");
        System.out.println("(3) exit");
    }
   
}
