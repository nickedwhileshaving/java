package finalproject;
 
import java.io.*; 
import java.util.*;

public class FinalProject {
    
    public static File aFile = new File("C:\\Temp\\balance.txt");
    public static int theBalance;
    private static int maxInt = 2147483647;
    private static int minInt = -2147483648;
    public static void main(String[] args) {
        theBalance = readBalanceFromFile();
        printEmptyLines();
        System.out.println("Welcome to Niki's Account Balancing Act");
        presentUserPrompt();
        while(true){
            Scanner input = new Scanner(System.in);
            String aString = input.nextLine();
            if ("X".equals(aString)){
                writeBalanceToFile();
                break;
            }
            if (isNumeric(aString)){
                int aTempInt = Integer.parseInt(aString);
                aTempInt = theBalance + aTempInt;
                if (aTempInt <0){
                    theStandardDelayedMessage("You cannot have a negative balance.");
                } else {
                    theBalance = aTempInt;
                    yourBalanceIsBeingUpdated();
                }
            } else{
                theStandardDelayedMessage("Please enter a numeric value.");
            }
            printEmptyLines();  
            presentUserPrompt();
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
        System.out.println("This is your current balance: $" + theBalance);
        System.out.println("Please enter the change to your balance.");
        System.out.println("Please enter 'X' to exit.");
    }
    public static boolean isNumeric(String strNum) {
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }    
    public static int readBalanceFromFile(){
        String theReturnValue = "";
        int theReturnValueInt = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(aFile)); 
            String st; 
            while ((st = br.readLine()) != null) {
              theReturnValue = st;
            } 
        } catch (Exception e) {
        }
        if (isNumeric(theReturnValue)){
            theReturnValueInt = Integer.parseInt(theReturnValue);
        }
        return theReturnValueInt;
    }
    public static void writeBalanceToFile(){
        try(FileWriter fileWriter = new FileWriter(aFile.getAbsolutePath())) {
            String fileContent = String.valueOf(theBalance);
            fileWriter.write(fileContent);
        } catch (IOException e) {
            // exception handling
        }        
    }
}
