import java.util.Scanner;

public class CandiesandTwoSisters2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long result;
            if (n >= 3) {
                result = (n%2 == 0) ? (n/2) - 1 : (n/2);
                System.out.println(result);
            } else {
                System.out.println("0");
            }
        }
        sc.close();
    }
}
