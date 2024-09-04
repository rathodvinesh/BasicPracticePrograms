package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={1,5,3,2};
        int n=arr.length-1;

        sort(arr,0,n);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void sort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int l=low;
        int r=mid+1;
        // int[] sortedArr = new int[r-l+1];
        int[] sortedArr = new int[high-low+1];
        int i=0;

        while(l<=mid && r<=high){
            if(arr[l]<=arr[r]){
                sortedArr[i++]=arr[l++];
            }else{
                sortedArr[i++]=arr[r++];
            }
        }

        while(l<=mid){
            sortedArr[i++]=arr[l++];
        }

        while(r<=high){
            sortedArr[i++]=arr[r++];
        }

        for(int j=0,k=low;j<sortedArr.length;j++,k++){
            arr[k]=sortedArr[j];
        }
    }
}