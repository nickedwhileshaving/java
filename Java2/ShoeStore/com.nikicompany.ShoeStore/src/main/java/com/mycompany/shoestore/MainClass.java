package com.mycompany.shoestore;
 
import java.io.*; 
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        ShoeStore aShoeStore = new ShoeStore();
        printEmptyLines();
        System.out.println("Welcome to Niki's Shoe Store.");
        presentUserPrompt();
        while(true){
            Scanner input = new Scanner(System.in);
            String aString = input.nextLine();
            if ("3".equals(aString)){
                break;
            } if ("2". equals(aString)){
                System.out.println("Here are the shoes.");
                for (Shoe aShoe : aShoeStore.getShoeList()) { 		   
                    System.out.println("------------------------------------------");
                    System.out.println("Name: " + aShoe.getName()); 		
                    System.out.println("Size: " + aShoe.getSize());
                    System.out.println("Model: " + aShoe.getModel());
                    System.out.println("------------------------------------------");
                }
                //getShoeList
            } if ("1".equals(aString)){
                System.out.print("Enter a Model: ");
                Scanner anotherInput = new Scanner(System.in);
                String anotherString = anotherInput.nextLine();  
                printEmptyLines();
                boolean isShoeHere = false;
                for (Shoe aShoe : aShoeStore.getShoeList()) {
                    if(aShoe.getName().equalsIgnoreCase(anotherString)){
                        System.out.println("Here is a shoe: ");
                        System.out.println("------------------------------------------");
                        System.out.println("Name: " + aShoe.getName()); 		
                        System.out.println("Size: " + aShoe.getSize());
                        System.out.println("Model: " + aShoe.getModel());
                        System.out.println("------------------------------------------"); 
                        isShoeHere = true;
                    }
                }
                if (!isShoeHere){
                    System.out.println("Your shoe(s) is not here.");
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
    public static void printEmptyLines(){
        for (int i=0; i<1000; i++){
            System.out.println();
        }
    }
    public static void presentUserPrompt(){
        System.out.println("(1) Lookup a shoe name");
        System.out.println("(2) Show all shoes");
        System.out.println("(3) exit");
    }
   
}
