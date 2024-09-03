public class RevArr {
    public static void main(String[] args) {
        int arr[]={22,54,9,123,541,54};
        // System.out.println(arr.length);
        int n=arr.length;

        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;

        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
