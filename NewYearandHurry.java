import java.util.Scanner;

public class NewYearandHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int time = sc.nextInt();
        int rem = 240 - time;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (rem > 0) {
                rem -= 5*i;
                count++;
            }
            if (rem < 0) {
                count--;
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
