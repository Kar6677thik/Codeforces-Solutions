import java.util.Scanner;

public class Elephant2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%5 == 0) {
            System.out.println(n/5);
        }
        else if (n > 5) {
            System.out.println((n/5)+1);
        }
        else if (n == 0) {
            System.out.println(n);
        }
        else {
            System.out.println("1");
        }
        sc.close();
    }
}
