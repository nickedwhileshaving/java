package Assignment1_2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;

public class FileWrite {
    
    private static int theInt = 45;
    private static String firstFilePath = "c:\\temp\\file1.txt";
    private static String secondFilePath = "c:\\temp\\file2.txt";
    private static String aCharT = "\t";
    private static byte[] tabByteArray = aCharT.getBytes();
    private static Double aDoubleValue = new Double(4654645);
    private static Boolean aBooleanValue = new Boolean (true);
    private static String HELLO_WORLD = "Hello World";
    
    public static void main(String[] args) throws IOException{
        writeFileOutputStream();
        writeDataOutputStream(); 
    }
    private static void writeFileOutputStream() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream (firstFilePath);
        fileOutputStream.write(new Integer(theInt).toString().getBytes());
        fileOutputStream.write(tabByteArray);
        fileOutputStream.write(aDoubleValue.toString().getBytes());
        fileOutputStream.write(tabByteArray);
        fileOutputStream.write(convertBooleanToString(aBooleanValue).getBytes());
        fileOutputStream.write(tabByteArray);
        fileOutputStream.write(HELLO_WORLD.getBytes());
        fileOutputStream.close();
    }
    private static void writeDataOutputStream() throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream (new FileOutputStream (secondFilePath));
        dataOutputStream.write(new Integer(theInt).toString().getBytes());
        dataOutputStream.write(tabByteArray);
        dataOutputStream.write(aDoubleValue.toString().getBytes());
        dataOutputStream.write(tabByteArray);
        dataOutputStream.write(convertBooleanToString(aBooleanValue).getBytes());
        dataOutputStream.write(tabByteArray);
        dataOutputStream.write(HELLO_WORLD.getBytes());
        dataOutputStream.close();
    }
    private static String convertBooleanToString(Boolean pBoolean){
        if (pBoolean){
            return "true";
        } else{
            return "false";
        }
    }
}
