import java.util.Scanner;

public class CandiesandTwoSisters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count;
        while (t-- > 0) {
            long can = sc.nextLong();
            long a = can - 1;
            long b = 1;
            int temp = 0;
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if (b>=a) {
                    count = temp;
                    System.out.println(count);
                    break;
                }
                a--;
                b++;
                temp++;
            }
        }
        sc.close();
    }
}
