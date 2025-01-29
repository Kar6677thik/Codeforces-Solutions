import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean caser = false;
        if (str.length() >= 7) {
            for (int i = 0; i <= str.length() - 7; i++) {
                if (str.substring(i, i + 7).equals("0000000") || str.substring(i, i + 7).equals("1111111")) {
                    System.out.println("YES");
                    caser = true;
                    break;
                }
            }
            if (!caser) {
            System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
