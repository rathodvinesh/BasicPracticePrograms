public class CountNum {
    public static void main(String[] args) {
        int n=123456;
        // int ogN= n;
        int ctr=0;

        while(n>0){
            n=n/10;
            // if(n==0){
            //     break;
            // }
            ctr++;
        }
        System.out.println(ctr);
    }
}
