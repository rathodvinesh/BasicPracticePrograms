package Practice.Quinnox;

import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<i;j++){
                if(i==n||j==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(i==n||j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        // for(int i=2;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=i;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=i;j<n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=i;j<=n;j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if(j==1||i==n)
        //             System.out.print("* ");
        //         else
        //             System.out.print("  ");
        //         }

        //         for(int j=2;j<=i;j++){
        //             if(j==i||i==n)
        //                 System.out.print("* ");
        //             else
        //                 System.out.print("  ");
        //         }
        //         System.out.println();

        //     }
    

        sc.close();
    }
}
