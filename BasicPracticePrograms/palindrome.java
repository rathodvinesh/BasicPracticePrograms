

public class palindrome{
    public static void main(String[] args){
        String s = "viniv";
        boolean isPali = true;

        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)!=s.charAt(s.length()-1-i)){
        //         isPali = false;
        //         break;
        //     }
        // }

        int low = 0;
        int high = s.length()-1;

        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                isPali = false;
            }
            low++;
            high--;
            // isPali = false;
        }
        
        if(isPali){
            System.out.println("It is a Pali");
        }else{
            System.out.println("It is not Pali");
        }
    }
}