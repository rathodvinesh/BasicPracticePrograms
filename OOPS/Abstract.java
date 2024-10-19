package OOPS;

abstract class car{
    abstract void drive();
    void fuel(){
        System.out.println("Fuel is in use");
    }
}

class WagonR extends car{
    public void drive(){
        System.out.println("I drive");
    }
}

public class Abstract {
    
    public static void main(String[] args) {
        WagonR e = new WagonR();
        e.drive();
        e.fuel();
    }

}
