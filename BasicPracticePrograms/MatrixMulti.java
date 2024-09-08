public class MatrixMulti {
    public static void main(String[] args) {
         // Define two matrices
         int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        
        // Number of rows and columns
        int m = A.length;          // Number of rows in A
        int n = A[0].length;       // Number of columns in A
        int p = B[0].length;       // Number of columns in B
        
        // Result matrix
        int[][] C = new int[m][p];
        
        // Perform matrix multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        // Print the result matrix
        System.out.println("Resultant Matrix:");
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < p; j++) {
        //         System.out.print(C[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        for(int i[]:C){
            for(int j:i){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
