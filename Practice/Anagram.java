package Practice;

public class Anagram {
    public static void main(String[] args) {

        
        // Scanner scanner = new Scanner(System.in);

        // // Input first word
        // System.out.println("Enter the first word:");
        // String word1 = scanner.nextLine().toLowerCase();

        // // Input second word
        // System.out.println("Enter the second word:");
        // String word2 = scanner.nextLine().toLowerCase();

        // // Check if lengths of both words are the same
        // if (word1.length() != word2.length()) {
        //     System.out.println("The words are not anagrams.");
        //     scanner.close();
        //     return; // Exit if lengths are not equal
        // }

        // // Convert both words to character arrays
        // char[] array1 = word1.toCharArray();
        // char[] array2 = word2.toCharArray();

        // // Create a count array for 26 characters (for 'a' to 'z')
        // int[] charCount = new int[26];

        // // Iterate over the characters of both words
        // for (int i = 0; i < word1.length(); i++) {
        //     // Increment the count for the character in word1
        //     charCount[array1[i] - 'a']++;

        //     // Decrement the count for the character in word2
        //     charCount[array2[i] - 'a']--;
        // }

        // // Check if all counts are zero
        // boolean isAnagram = true;
        // for (int i = 0; i < 26; i++) {
        //     if (charCount[i] != 0) {
        //         isAnagram = false;
        //         break;
        //     }
        // }

        // // Print the result
        // if (isAnagram) {
        //     System.out.println("The words are anagrams.");
        // } else {
        //     System.out.println("The words are not anagrams.");
        // }

        // scanner.close();

        String s1 = "heart";
        String s2 = "earth";
        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
        }
        else{
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            // java.util.Arrays.sort(ch1);
            // java.util.Arrays.sort(ch2);

            for(int i=0;i<ch1.length-1;i++){
                for(int j=0;j<ch1.length-i-1;j++){
                    if(ch1[j]>ch1[j+1]){
                        char temp = ch1[j];
                        ch1[j] = ch1[j+1];
                        ch1[j+1] = temp;
                    }
                    if(ch2[j]>ch2[j+1]){
                        char temp = ch2[j];
                        ch2[j] = ch2[j+1];
                        ch2[j+1] = temp;
                    }
                }
            }
            boolean flag = true;

            for(int i=0;i<ch1.length;i++){
                if(ch1[i]!=ch2[i]){
                    // System.out.println(" Anagram");
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
    }
}
