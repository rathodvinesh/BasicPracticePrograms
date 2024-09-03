public class Diseream {
    public static void main(String[] args) {
        int n=135;
        int og_n=n;
        int final_check=n;
        int sum=0;
        int digits=0;
        int power=1;

        while(n!=0){
            digits++;
            n/=10;
        }

        while(og_n>0){
            int rem=og_n%10;
            for(int i=1;i<=digits;i++){
                power*=rem;
            }
            digits--;
            sum+=power;
            og_n/=10;
            power=1;
        }

        if(sum==final_check){
            System.out.print("Is Diseream");
        }
    }
}
