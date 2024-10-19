package OOPS;

class Sub{
    public int sub(int a,int b){
        return a-b;
    }
    public int sub(int a,int b,int c){
        return a-b-c;
    }
}

public class Poly_comp {
    public static void main(String[] args) {
        Sub s= new Sub();
        s.sub(1, 2,4);
    }
}
