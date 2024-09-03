public class fib {
    public static void main(String[] args) {

        int a=0,b=1;
        System.out.print(a+" "+b);

        for(int i=2;i<10;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }


        // int a=0,b=1,c,n=5;
        // System.out.print(a +" "+ b);

        // for(int i=2;i<=n;i++){
        //     c=a+b;
        //     System.out.print(" "+c);
        //     a=b;
        //     b=c;
        // }
    }
}
