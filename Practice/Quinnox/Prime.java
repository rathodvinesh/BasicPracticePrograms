package Practice.Quinnox;

public class Prime {
    public static void main(String[] args) {
        
        int n=3;
        boolean isP=true;

        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isP=false;
                // break;
            }
        }
        if(isP){
            System.out.print("Is ");
        }else{
            System.out.print("Is not");
        }
    }
}
