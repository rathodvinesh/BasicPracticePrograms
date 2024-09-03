class Armstrong{
    public static void main(String[] args) {
        int n=1634;
        int og_n=n;
        int final_n=n;
        int sum=0;
        int digits=0;
        // int final=n;
        
        while(n!=0){
            // int rem=n%10;
            digits++;
            n/=10;
        }
        
        while(og_n>0){
            int power=1;
            int rem=og_n%10;
            for (int i = 0; i < digits; i++) {
                power *= rem;
            }
            sum = sum+power;
            og_n/=10;
        }

        if(sum==final_n){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}