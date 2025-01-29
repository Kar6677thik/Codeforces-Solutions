import java.util.Scanner;

public class MishkaandGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int mishka = 0;
        int chris = 0;
        while (t>0) {
            int m = sc.nextInt();
            int c = sc.nextInt();
            if (m > c) {
                mishka++;
            }
            if (c > m) {
                chris++;
            }
            t--;
        }
        if (mishka > chris) {
            System.out.println("Mishka");
        }
        else if (mishka < chris) {
            System.out.println("Chris");
        } else {
            System.out.println("Friendship is magic!^^");
        }
        sc.close();
    }
}