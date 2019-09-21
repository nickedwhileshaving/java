package interfaceassignment;

public class Square implements Shape {
    
    private double mSide;
    
    public Square(double pSide){
        this.mSide = pSide;
    }
    public double computeArea(){
        return mSide * mSide;
    }
}
