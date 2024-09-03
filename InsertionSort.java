public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={5,4,2,1,3};

        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
