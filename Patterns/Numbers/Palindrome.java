package patterns.Numbers;


class Numbers{
    public void increasingTri(int n){
        // int n=5;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void decreasingTri(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void hill(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }

            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

        // for(int i=1;i<=n;i++){

        //     System.out.println();
        // }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        int n=5;
        Numbers no = new Numbers();
        // no.decreasingTri(n);
        no.hill(n);
    }
}
