import java.util.Scanner;

public class VanyaandCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            n -= (i*(i+1))/2;
            count++;
        }
        if (n < 0) {
            count--;
        }
        System.out.println(count);
        sc.close();
    }
}
