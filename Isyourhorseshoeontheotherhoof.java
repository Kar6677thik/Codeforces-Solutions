import java.util.Arrays;
import java.util.Scanner;

public class Isyourhorseshoeontheotherhoof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int t = 0;
        for (int i = 0; i < 3; i++) {
            if (a[i] == a[i + 1]) {
                t++;
            }
        }
        System.out.println(t);
        scanner.close();
    }
}

