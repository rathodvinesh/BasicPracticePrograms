
import java.util.HashSet;

public class Dupli {
    public static void main(String[] args){
        String arr[]={"java","python","c++","java"};

        HashSet<String> langs = new HashSet<>();

        boolean f=true;
        
        for(String l:arr){
            if(langs.add(l)==false){
                System.out.println("Found dupli : "+l);
                f=false;
                // break;
            }
        }
        if(f){
            System.out.println("Not found");
        }
    }
}
