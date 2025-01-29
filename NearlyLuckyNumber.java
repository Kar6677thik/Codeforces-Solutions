import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int len = String.valueOf(num).length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            int rem = (int)num%10;
            if ((rem == 7) || (rem == 4)) {
                count++;
            }
            num /= 10;
        }
        boolean finall = true;
        while (count > 0) {
            int digit = count % 10;
            if (digit != 7 && digit != 4) {
                finall = false;
                break;
            }
            count /= 10;
        }
        if(finall) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
