import java.util.Scanner;

public class GeorgeandAccommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while (t-->0) {
            int people = sc.nextInt();
            int cap = sc.nextInt();
            int rem = cap - people;
            if (rem >= 2) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
