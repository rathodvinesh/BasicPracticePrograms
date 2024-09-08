class Armstrong{
    public static void main(String[] args) {
        int n=370;
        int og_n=n;
        // int final_n=n;
        int sum=0;
        int digits=0;
        // int final=n;
        
        int temp=n;
        while(temp!=0){
            // int rem=n%10;
            digits++;
            temp/=10;
        }

        temp=n;
        while(temp>0){
            int power=1;
            int rem=temp%10;
            for (int i = 0; i < digits; i++) {
                power *= rem;
            }
            sum+=power;
            // sum = sum+(int)Math.pow(rem, digits);
            temp/=10;
        }

        if(sum==og_n){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}