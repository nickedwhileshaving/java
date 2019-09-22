package AbstractClassAssignment;

public class App {
    
    public static void main(String[] args){
        
        Sofa aSofa = new Sofa();
        CoffeeTable aCoffeeTable = new CoffeeTable();
        
        System.out.println("This is the price of a sofa: $" + 
                aSofa.computePrice());
        System.out.println("This is the company name of sofa: " +
                aSofa.getCompanyName());
        System.out.println("This is the price of a coffee table: $" + 
                aCoffeeTable.computePrice());
        System.out.println("This is the company name of the coffee table: " +
                aCoffeeTable.getCompanyName());
        
        
    }
}
