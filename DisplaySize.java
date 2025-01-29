import java.util.Scanner;

public class DisplaySize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = n/2;
        long b = n/2;
        if (n >= 2) {
        while (a > 0) {
            b = n/a;
                if (a<=b && a*b == n) {
                    System.out.println(a+" "+b);
                    break;
                }
                a--;
        }
    } else {
        System.out.println("1 1");
    }
        sc.close();
    }
}
