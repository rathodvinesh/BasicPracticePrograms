
public class reverseNum {
    public static void main(String[] args) {

        int n = 12315;
        int rev = 0;
        // int og=n;

        // for

        while (n != 0 && n<=Integer.MAX_VALUE) {
            int rem = n % 10;
            System.out.println("rem="+ rem);
            rev = rev*10+ rem;
            System.out.println("rev="+rev);
            n = n / 10;
            System.out.println("num="+n);
        }

        // if(og==rev){
        //     System.out.println("Is Pali");
        // }

        System.out.println(rev);
        // if(n==rev){
        //     System.out.println("It is a Pali");
        // }else{
        //     System.out.println("It is not Pali");
        // }

    }
}
