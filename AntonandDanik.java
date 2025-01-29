import java.util.Scanner;

public class AntonandDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String str = sc.next();
        int anton = 0;
        int danik = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'A') {
                anton++;
            } else {
                danik++;
            }
        }
        if (anton > danik) {
            System.out.println("Anton");
        } else if (danik > anton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        sc.close();
    }
}
