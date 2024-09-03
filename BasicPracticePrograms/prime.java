public class prime {
    public static void main(String[] args) {
        int n = 73;
        boolean isPrime = false;

        for(int i=2;i<=n/2;i++){
            if(n%i!=0){
                isPrime=true;
                break;
            }
        }
        if(isPrime) System.out.println("Is prime");
        else System.out.println("Not prime");

        // for(int i=2;i<=n/2;i++){
        //     if(n%i==0){
        //         isPrime = false;
        //         break;
        //     }
        // }
        // if(isPrime){
        //     System.out.println("Prime");
        // }else{
        //     System.out.println("Not Prime");
        // }
    }
}
