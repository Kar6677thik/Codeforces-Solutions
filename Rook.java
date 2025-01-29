import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            char c;
            char[] s = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
            int k;
            String str = scanner.next();
            c = str.charAt(0);
            k = str.charAt(1) - '0';
            for (int i = 1; i <= 8; i++) {
                if (i != k) System.out.println(c + "" + i);
            }
            for (int i = 0; i < 8; i++) {
                if (s[i] != c) System.out.println(s[i] + "" + k);
            }
        }
        scanner.close();
    }
}

