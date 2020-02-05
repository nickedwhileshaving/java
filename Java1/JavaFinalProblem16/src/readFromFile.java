import java.io.*;
import java.util.Locale;
import java.util.Scanner;

//Java program to demonstrate PrintWriter

public class readFromFile {
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("e:test1.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
            System.out.println("Enter name: ");
            String name = in.nextLine();
            printWriter.print(name);
            printWriter.close();
    }   
}
