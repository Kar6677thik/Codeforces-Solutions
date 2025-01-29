import java.util.Scanner;

public class TheKingsRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        if (n % 2 != 0 && x == y) {
            System.out.println("White");
        } else {
            if (((x + y) % 2 == 0) && (x <= n / 2 || y <= n / 2)) {
                System.out.println("White");
            } else if (((x + y) % 2 != 0) && (x <= n / 2 || y <= n / 2)) {
                System.out.println("White");
            } else if (((x + y) % 2 == 0) && (x >= n / 2 || y >= n / 2)) {
                System.out.println("Black");
            } else if (((x + y) % 2 != 0) && (x >= n / 2 || y >= n / 2)) {
                System.out.println("Black");
            }
        }
        sc.close();
    }
}
