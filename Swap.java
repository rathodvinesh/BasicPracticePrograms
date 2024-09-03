public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b =20;

        b = a+b-(a=b);
        // System.out.println(a=b);
        // System.out.println(a+b);
        // System.out.println(a+b-(a=b));

        System.out.println("a="+a+" b="+b);
    }
}
