

public class arr {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int greater = array[0];
        for(int num:array){
            // greater = array[i];
            if(greater<num){
                greater = num;
                // System.out.println(array[i+1]+" is greater than "+array[i]);
            }
        }
        System.out.println(greater);
    }
}
