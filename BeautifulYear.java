import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        while (true) {
            y += 1;
            int a = y / 1000;
            int b = y / 100 % 10;
            int c = y / 10 % 10;
            int d = y % 10;
            if (a != b && a != c && a != d && b != c && b != d && c != d) {
                break;
            }
        }
        System.out.println(y);
        scanner.close();
    }
}

