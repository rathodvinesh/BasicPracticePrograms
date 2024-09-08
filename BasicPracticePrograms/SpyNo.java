public class SpyNo {
    public static void main(String[] args) {
    
        for(int i=1;i<=1000;i++){
            int sum=0;
            int pro=1;
            int temp=i;
            while(temp>0){
                int rem=temp%10;
                sum+=rem;
                pro*=rem;
                temp/=10;
            }
    
            if(sum==pro){
                System.out.println(""+i+ " is Spy Number");
            }else{
                // System.out.println(""+i+ "is not Spy Number");
            }
        }
    
    }
}
