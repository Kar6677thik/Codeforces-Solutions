import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String str = sc.next();
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < str.length() / 2; i++) {
                sum1 += str.charAt(i) - '0';
            }
            for (int i = str.length() / 2; i < str.length(); i++) {
                sum2 += str.charAt(i) - '0';
            }
            if (sum1 == sum2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");   
            }
        }
        sc.close();
    }
}
