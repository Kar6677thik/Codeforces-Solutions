import java.util.Scanner;

public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t--) {
            int x, y, n;
            x = scanner.nextInt();
            y = scanner.nextInt();
            n = scanner.nextInt();
            if (n - n % x + y <= n) {
                System.out.println(n - n % x + y);
            } else {
                System.out.println(n - n % x - (x - y));
            }
        }
    }
}

