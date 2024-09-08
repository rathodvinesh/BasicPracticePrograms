import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first array
        System.out.println("Enter the size of the first array:");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input for second array
        System.out.println("Enter the size of the second array:");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Merging both arrays
        int[] mergedArray = new int[size1 + size2];
        int index = 0;

        // Copy elements from the first array
        for (int i = 0; i < size1; i++) {
            mergedArray[index] = array1[i];
            index++;
        }

        // Copy elements from the second array
        for (int i = 0; i < size2; i++) {
            mergedArray[index] = array2[i];
            index++;
        }

        // Output the merged array
        System.out.println("Merged array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        scanner.close();
    }
}
