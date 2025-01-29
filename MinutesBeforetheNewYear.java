import java.util.Scanner;

public class MinutesBeforetheNewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int hours = sc.nextInt();
            int mins = sc.nextInt();
            int remH = 24 - hours;
            System.out.println((remH*60) - mins);
        }
        sc.close();
    }
}
