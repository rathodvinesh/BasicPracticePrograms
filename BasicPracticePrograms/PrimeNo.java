
public class PrimeNo {

    public static void main(String[] args) {
        int n = 30;
        int primeC = 0;
        int row = 1;
        for (int i = 2;primeC<n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                primeC++;
                if (primeC == (row * (row + 1)) / 2) {
                    System.out.println();
                    row++;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
