import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int drinks = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < drinks; i++) {
            int percent = sc.nextInt();
            sum += percent;
        }
        double result = ((double) sum / drinks);
        String formattedResult = String.format("%015.12f", result);
        System.out.println(formattedResult);
        sc.close();
    }
}
