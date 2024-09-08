
import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        // int n=8;
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int fact =1;
        for(int i=1;i<=n;i++){
            fact*=i;
            System.out.println(fact);
        }
        sc.close();
    }
}
