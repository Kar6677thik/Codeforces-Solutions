import java.util.Scanner;

public class IQtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int k = 0, m = 0, l = 0, g = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] % 2 == 0) {
                k++;
                m = i;
            } else {
                l++;
                g = i;
            }
        }
        if (k == 1) {
            System.out.println(m + 1);
        } else {
            System.out.println(g + 1);
        }
        scanner.close();
    }
}

