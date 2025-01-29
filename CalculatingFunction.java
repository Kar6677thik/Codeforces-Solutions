import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        float checker = n%2;
        if (checker == 0.0f) {
            sum = n/2;
        } else {
            sum = (((n+1)/2))*(-1);
        }
        System.out.println(sum);
        sc.close();
    }
}
