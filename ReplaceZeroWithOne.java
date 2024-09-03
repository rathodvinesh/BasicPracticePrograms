
public class ReplaceZeroWithOne {
    public static void main(String[] args) {

        int n=12030;

        int place=1;
        int res=0;

        while(n>0){
            int digits=n%10;
            if(digits==0){
                digits=1;
            }
            res=res+digits*place;
            place=place*10;
            n=n/10;
        }
        System.out.println(res);


        // Scanner scanner = new Scanner(System.in);
        
        // // Input the number
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();
        
        // // Handle the special case where the number is 0
        // if (number == 0) {
        //     System.out.println("1");
        //     return;
        // }
        
        // int result = 0;
        // int place = 1;
        
        // // Process each digit of the number
        // while (number > 0) {
        //     int digit = number % 10;  // Get the last digit
            
        //     if (digit == 0) {
        //         digit = 1;  // Replace 0 with 1
        //     }
            
        //     result += digit * place;  // Add the digit to the result at the correct place value
        //     place *= 10;  // Move to the next place value
        //     number /= 10;  // Remove the last digit
        // }
        
        // System.out.println("Number after replacing 0 with 1: " + result);
        
        // scanner.close();
    }
}
