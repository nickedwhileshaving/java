package AbstractClassAssignment;

public class Sofa extends Furniture {
    public int computePrice(){
        return 2000;
    }
    public String getCompanyName(){
        return super.getCompanyName();
    }
}
