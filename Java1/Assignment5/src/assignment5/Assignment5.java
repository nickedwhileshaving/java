package assignment5;

public class Assignment5 {

    
    public static void main(String[] args) {
        
        int numberEntered = 7;
        String value;
        
        switch (numberEntered){
            
            case 1: 
                value = "Nothing defined for 1";
                break;
            case 2:
                value = "ABC";
                break;
            case 3:
                value = "DEF";
                break;
            case 4:
                value = "GHI";
                break;
            case 5:
                value = "JKL";
                break;
            case 6:
                value = "MNO";
                break;
            case 7:
                value = "PQRS";
                break;
            case 8:
                value = "TUV";
                break;
            case 9:
                value = "WXYZ";
                break;
            default:
                value = "Not defined";
                break;
            
        }
        System.out.println(value);
    }
    
}
