package assignment2;

public class Assignment2 {

public static void main(String[] args) {
        Car aCar = new Car();
        aCar.setSpeed(70); 
        int theCarSpeed = aCar.speed();
        System.out.println("This is the speed: " + theCarSpeed);
    }
}
