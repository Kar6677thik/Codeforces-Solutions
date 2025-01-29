import java.util.Scanner;

public class PanoramixsPrediction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = n + 1;
        while (!isPrime(k)) {
            k++;
        }
        if (k == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }

    public static boolean isPrime(int a) {
        int k = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                k++;
            }
        }
        if (k == 2) {
            return true;
        } else {
            return false;
        }
    }
}

