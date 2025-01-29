import java.util.Scanner;

public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] str = new char[n][m];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                str[i][j] = scanner.next().charAt(0);
                if (str[i][j] != 'W' && str[i][j] != 'B' && str[i][j] != 'G') {
                    k++;
                }
            }
        }
        if (k != 0) {
            System.out.println("#Color");
        } else {
            System.out.println("#Black&White");
        }
        scanner.close();
    }
}

