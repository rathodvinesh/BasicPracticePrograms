package Practice.Quinnox;

public class ArrayEq {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,4};
        boolean isE=true;

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    isE=false;
                }
            }
        }

        if(arr1.equals(arr2))            
        System.out.print("Is ");
        else             
        System.out.print("Is not");



        // if(isE) System.out.println("is eq");
        // else System.out.println("not");
    }
}
