public class PrimeNo {
    public static void main(String[] args) {
        boolean isPrime = true;
        
        int n=6;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    
    }
}
