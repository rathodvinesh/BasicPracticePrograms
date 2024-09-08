public class Diseream {
    public static void main(String[] args) {
        int n=625;
        int og_n=n;
        int sum=0;
        int digits=0;
        int power=1;

        while(n!=0){
            digits++;
            n/=10;
        }

        n=og_n;
        while(n>0){
            int rem=n%10;
            for(int i=1;i<=digits;i++){
                power*=rem;
            }
            digits--;
            sum+=power;
            n/=10;
            power=1;
        }

        if(sum==og_n){
            System.out.print("Is Diseream");
        }else{
            System.out.print("Not Diseream");
        }
    }
}
