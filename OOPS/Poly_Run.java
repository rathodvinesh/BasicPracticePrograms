package OOPS;


class Add{
    public int add(int a,int b){
        System.out.println("In A");
        return a+b;
    }
}

class Bad extends Add{
    public int add(int a,int b){
        System.out.println("In B");
        return a+b;
    }
}

public class Poly_Run {
    public static void main(String[] args) {
        Add obj = new Bad();
        obj.add(1, 2);
    }
}
