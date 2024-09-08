
public class secondLargest {

    public static void main(String args[]) {
        int[] arr = {-4,-6,-1,-2};

        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

 
    }
}
