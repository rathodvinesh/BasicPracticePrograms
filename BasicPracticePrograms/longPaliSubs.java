/**
 * longPaliSubs
 */
public class longPaliSubs {

    public static void main(String[] args) {
        String s = "aba";
        String rev = "";
        // int[] n={1,2,3,4};

        for(int i=0;i<s.length();i++){
            rev = s.charAt(i)+rev;
            // System.out.println(rev);
        }

        

        if(s.equals(rev)){
            System.out.println("It is a Pali");
        }else{
            System.out.println("It is not Pali");
        }
    }
}