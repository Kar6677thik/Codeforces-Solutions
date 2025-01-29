import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[3];
        int ans = 0;
        while (t != 0) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }
            for (int n : arr) {
                if (n == 1) {
                    count++;
                }
            }
            if (count >= 2) {
                ans++;
            }
            t--;
        }
        System.out.println(ans);
        sc.close();
    }
}
