import java.util.Arrays;
import java.util.Scanner;

public class ForgottenEpisode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long[] a = new long[(int) (n - 1)];
        for (int i = 0; i < n - 1; i++) {
            a[i] = scanner.nextLong();
        }
        Arrays.sort(a);
        int k = 0;
        if (a[0] == 1) {
            for (int i = 0; i < n - 2; i++) {
                if (a[i + 1] - a[i] != 1) {
                    k = i + 2;
                    break;
                }
            }
            if (k != 0) {
                System.out.println(k);
            } else {
                System.out.println(n);
            }
        } else {
            System.out.println(1);
        }
        scanner.close();
    }
}

