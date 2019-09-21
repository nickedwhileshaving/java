public class App{
    public static void main (String[] args){
        //Toyota object
        Toyota ty = new Toyota();
        ty.setCarColor("Red");
        ty.setMaxSpeed(200);
        //Honda object
        Honda ho = new Honda();
        ho.setCarColor("Blue");
        ho.setMaxSpeed(200);
        //Audi object
        Audi au = new Audi();
        au.setCarColor("Silver");
        au.setMaxSpeed(150);
        System.out.println("Honda Color is " + ho.carColor
        + ", max speed is" + ho.maxSpeed);
        System.out.println("Toyota Color is " + ty.carColor
        + ", max speed is" + ty.maxSpeed);
        System.out.println("Audi Color is " + au.carColor
        + ", max speed is" + au.maxSpeed);
        
    }
}
