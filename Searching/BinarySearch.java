package Searching;
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr={12,22,32,42,52};
        int key=42;
        int l=0;
        int r = arr.length-1;
    
        while(l<=r){
            int mid=(l+r)/2;

            if(key>arr[mid]){
                l=mid+1;
            }
            if(key<arr[mid]){
                r=mid-1;
            }
            if(arr[mid]==key){
                System.out.println("Found at "+(mid+1));
                break;
            }
        }
        
    }
}
