// public class GCD {
//     public static void main(String[] args) {
//         int n1=5;
//         int n2=10;
//         int gcd=0;

//         // int ans = (n1>n2)?n1:n2;

//         for(int i=1;i<=n1 && i<=n2;i++){
//             if(n1%i==0 && n2%i==0){
//                 gcd=i;
//             }
//         }
//         System.out.println(gcd);
//     }
// }

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Calculate GCD
        int gcd = findGCD(num1, num2);
        
        // Output the result
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
        
        scanner.close();
    }

    public static int findGCD(int a, int b) {
        // Ensure a >= b
        if (b == 0) {
            return a;
        }
        // Recursive step
        return findGCD(b, a % b);
    }
}

