
public class MissingEle {
    public static void main(String[] args){
        int[] a = {22,24,25};
        int sum1=0,sum2=0;
        int n=a.length-1;

        for(int i=0;i<=n;i++){
            sum1+=a[i];
            System.out.println(sum1);
        }
        System.out.println("Element mila "+a[0]+" "+a[n]);

        for(int i=a[0];i<=a[n];i++){
            sum2+=i;
            System.out.println(sum2);
        }

        System.out.println("The element missing is "+(sum2-sum1));
    }
}
