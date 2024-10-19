package OOPS;

interface A {

    void pay(int n);

    void paid(int n);
    
}

class B implements A{

    public void pay(int n) {
        System.out.println("In pay "+n);
    }

    public void paid(int n) {
        System.out.println("In paid "+n);

        // throw new UnsupportedOperationException("Unimplemented method 'paid'");
    }
    
}

public class Interface {
    public static void main(String[] args) {
        A obj;
        obj=new B();
        obj.paid(11);
        obj.pay(10);
    }
}
