
public class RevEachWord {
    public static void main(String[] args) {
        String str = "Welcome to java";
        String[] words = str.split("\s");
        String revString = "";

        /*for(String eachWord:words){
            String revWords = "";
            for(int i=eachWord.length()-1;i>=0;i--){
                revWords+=eachWord.charAt(i);
            }
            revString+=revWords+" ";
        }*/

        for(String w:words){
            
            StringBuilder sb = new StringBuilder(w);
            String revWords = sb.reverse().toString();

            revString+=revWords+" ";

        }

        System.out.println(revString);
    }
}
