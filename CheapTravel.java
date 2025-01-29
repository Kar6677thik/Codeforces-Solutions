import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rides = sc.nextInt();
        int m = sc.nextInt();
        int one = sc.nextInt();
        int mrides = sc.nextInt();
        int res = rides / m;
        rides -= res * m;
        int tot;
        if (m < rides * one) {
            tot = res * mrides + mrides;
            if (tot == mrides && tot > one * rides) {
                System.out.println(tot);
            } else {
                System.out.println(tot);
            }
        } else {
            tot = res * mrides + rides * one;
            System.out.println(tot);
        }
        sc.close();
    }
}
