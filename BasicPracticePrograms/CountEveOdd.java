public class CountEveOdd {
    public static void main(String[] args) {
        int n=958445411;
        int e=0,o=0;

        while (n>0) {
            int rem = n%10;
            if(rem%2==0) e++;
            else o++;
            n/=10;
        }
        System.out.println("Even is "+e+" & Odd is "+o);
    }
}
