public class Hetermecic {
public static void main(String[] args) {
    int n=462;
    boolean isHeteromecic=false;

    for(int i=1;i<=n;i++){
        if(i*(i+1)==n){
            // System.out.println("Is heteromecic");
            isHeteromecic=true;
            break;
        }
    }

    if(isHeteromecic){
        System.out.println("Is heteromecic");
    }else{
        System.out.println("Is not heteromecic");

    }
    
}
}
