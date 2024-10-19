package patterns.Numbers;

public class primeIncre {
    public static void main(String[] args) {
        int n=30;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(n%j!=0){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
