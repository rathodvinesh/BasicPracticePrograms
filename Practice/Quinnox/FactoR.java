package Practice.Quinnox;

import java.util.Scanner;

public class FactoR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;

        for(int i=1;i<=n;i++){
            res=fact(i);
        }

        System.out.println(res);
        sc.close();
    }
    public static int fact(int n){

        if(n==0) return 1;

        return n*fact(n-1);
    }
}
