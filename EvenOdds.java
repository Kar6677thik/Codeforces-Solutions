import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if (k == n) {
            System.out.println(2*(n-k));
        } else if (k>n/2) {
            System.out.println(2*(n-k));
        } else {
            System.out.println(2*k-1);
        }
        sc.close();
    }
}
