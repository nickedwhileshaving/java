package assignment2;

public class Car {
    private String model;
    private int year;
    private String color;
    private String make;
    private boolean isFourDoor;
    private int speedInternal;
    
    public int speed(){
        return speedInternal;
    }
    
    public void setSpeed(int pSpeed){
        this.speedInternal = pSpeed;
    }

    
}
