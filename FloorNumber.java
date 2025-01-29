import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests != 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n <= 2) {
                System.out.print(1);
            } else if ((n - 2) % x == 0) {
                System.out.print(((n - 2) / x) + 1);
            } else {
                System.out.print(((n - 2) / x) + 2);
            }
            tests--;
            System.out.println();
        }
        sc.close();
    }
}

