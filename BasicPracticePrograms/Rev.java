public class Rev {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7};
        int l=2;
        int r=4;
        int temp;
        while(l<=r){
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
