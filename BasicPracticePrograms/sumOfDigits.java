/**
 * sumOfDigits
 */
public class sumOfDigits {

    public static void main(String[] args) {
        int n = 95136478;
        int sum = 0;

        while(n>0){
            // System.out.println(i);
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);

        /*for(int i=0;i<n;i++){
            int rem = n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println(sum);*/
    }
}