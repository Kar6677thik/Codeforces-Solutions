import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        String s = sc.next();
        int energy = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            if (num == 1) {
                energy += a;
            }
            if (num == 2) {
                energy += b;
            }
            if (num == 3) {
                energy += c;
            }
            if (num == 4) {
                energy += d;
            }
        }
        System.out.println(energy);
        sc.close();
    }
}
