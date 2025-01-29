import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        int count = 0;
        while(limak <= bob) {
            limak *= 3;
            bob *= 2;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
