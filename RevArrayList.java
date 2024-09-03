
import java.util.ArrayList;

public class RevArrayList {

    public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,int r) {
        
        while(l<r){
            int temp = arr.get(l);
            arr.set(l, arr.get(r));
            arr.set(r, temp);
            // arr.

            l++;
            r--;
        }

        return arr;
    }
    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);

        int l = 2;
        int r = 4;

        ArrayList<Integer> result = reverseSubArray(arr, l, r);

        // Print the result
        System.out.println(result);
    }
}
