package assignment3;

public class Assignment3 {

    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        
        number1 = 0;
        number2 = 1;
        
        System.out.println(number1);
        System.out.println(number2);
        
        for (int anInt = 0; anInt < 13; anInt++) {
            number3 = number1 + number2;
            System.out.print(number3 + " ");
            number1 = number2;
            number2 = number3;
        }
                
    }
}
