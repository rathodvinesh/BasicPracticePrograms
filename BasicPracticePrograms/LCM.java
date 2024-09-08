public class LCM {
    public static void main(String[] args) {
        int n1=10;
        int n2=9;

        int ans = (n1>n2)?n1:n2;

        while(true){
            // System.out.println(ans%n1+" "+ans%n2);
            if(ans%n1==0 & ans%n2==0){
                break;
            }
            // System.out.println(ans);

            ans++;
            // System.out.println(ans);
        }
        System.out.println(ans);
    }
}
