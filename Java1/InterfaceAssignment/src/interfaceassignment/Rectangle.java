package interfaceassignment;

public class Rectangle implements Shape {
    
    double mLength;
    double mWidth;
    
    public Rectangle(double pLength, double pWidth){
        this.mLength = pLength;
        this.mWidth = pWidth;
    }
    public double computeArea(){
        return this.mLength * this.mWidth;
    }
}
