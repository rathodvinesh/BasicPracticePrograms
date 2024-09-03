class MaxMin{
    public static void main(String[] args) {
        int[] array ={3, 2, 1, 56, 10000, 167};

        int mx = array[0];
        int mn = array[0];

        for(int i=1;i<array.length;i++){
            if(array[i]>mx){
                mx=array[i];
            }
            if(array[i]<mn){
                mn = array[i];
            }

        }

        System.out.println(mn+" "+mx);
    }

}