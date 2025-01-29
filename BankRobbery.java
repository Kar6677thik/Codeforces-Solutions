import java.util.Scanner;

public class BankRobbery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a, b, c;
        a = scanner.nextLong();
        b = scanner.nextLong();
        c = scanner.nextLong();
        long n;
        n = scanner.nextLong();
        long[] l = new long[(int) n];
        long k = 0;
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextLong();
            if (l[i] > b && l[i] < c) {
                k++;
            }
        }
        System.out.println(k);
        scanner.close();
    }
}

