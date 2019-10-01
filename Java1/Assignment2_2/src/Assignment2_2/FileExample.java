package Assignment2_2;

import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.File;


public class FileExample {
    public static void main (String[] args) throws Exception {
        String path = args [0];
        File filesDirectory = new File(path);
        File[] files = filesDirectory.listFiles();
        try {
        for(File file:files){
            System.out.println(file.getName());
        }
        } catch (Exception anEx){
            System.out.println("Path entered was not valid");
        }
    }
}
