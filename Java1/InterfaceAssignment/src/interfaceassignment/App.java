package interfaceassignment;


public class App {

    
    public static void main(String[] args) {
        
        double mSide = 4.2;
        double mRadius = 6.7;
        double mLength = 3.4;
        double mWidth = 4.2;
        
        Circle aCircle = new Circle(mRadius);
        Square aSquare = new Square(mSide);
        Rectangle aRectangle = new Rectangle(mLength, mWidth);
        
        System.out.println("Side = " + mSide);
        System.out.println("Radius = " + mRadius);
        System.out.println("Length = " + mLength);
        System.out.println("Width = " + mWidth);
        
        System.out.println("Area of a Circle: " + aCircle.computeArea());
        System.out.println("Area of a Square: " + aSquare.computeArea());
        System.out.println("Area of a Rectangle: " + aRectangle.computeArea());
    }
    
}
