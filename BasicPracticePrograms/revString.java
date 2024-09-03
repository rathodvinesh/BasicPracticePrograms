
public class revString {

    public static void main(String[] args) {
        
        String s = "madam";
        String rev = "";
        for(int i=0;i<s.length();i++){
            rev = s.charAt(i)+rev;
        }
        if(s.equals(rev)){
            System.out.println("It is a Pali");
        }else{
            System.out.println("It is not Pali");
        }
        // System.out.println(rev);


        /*String s="vinesh";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev =rev+s.charAt(i);
        }
        System.out.println(rev);*/
    }
    
}