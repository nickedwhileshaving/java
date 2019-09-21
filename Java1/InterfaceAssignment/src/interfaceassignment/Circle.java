package interfaceassignment;

public class Circle implements Shape {
    
    private double mRadius;
    
    public Circle (double pRadius){
        this.mRadius = pRadius;
    }
    public double computeArea(){
        return mRadius * mRadius * Shape.PI_VALUE;
    }
}
