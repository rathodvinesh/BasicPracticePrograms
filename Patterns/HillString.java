package patterns;

public class HillString {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            // System.out.print("*");
            for(int j=i;j<=n;j++){
                System.out.print("    ");
            }
            for(int j=1;j<i;j++){
                System.out.print("ABC ");
            }
            // for(int j=i;j<=n;j++){
            //     System.out.print(" ");
            // }
            for(int j=1;j<=i;j++){
                System.out.print("ABC ");
            }
            System.out.println();
        }
        
    }
}
