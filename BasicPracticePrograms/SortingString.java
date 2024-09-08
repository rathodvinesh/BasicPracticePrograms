
import java.util.Scanner;

public class SortingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Sorting the character array using bubble sort
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - i - 1; j++) {
                // Compare two adjacent characters
                if (charArray[j] > charArray[j + 1]) {
                    // Swap the characters if they are out of order
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        // Convert the sorted character array back to a string
        String sortedString = new String(charArray);

        // Output: Display the sorted string
        System.out.println("Sorted string: " + sortedString);

        scanner.close();
    }


}
