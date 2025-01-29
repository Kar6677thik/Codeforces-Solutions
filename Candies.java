import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candies = sc.nextInt();
        int friends = sc.nextInt();
        
        if (candies % friends == 0) {
            int eachGets = candies / friends;
            for (int i = 0; i < friends; i++) {
                System.out.print(eachGets + " ");
            }
        } else {
            int eachGets = candies / friends;
            int extraCandies = candies % friends;

            for (int i = 0; i < friends; i++) {
                int share = eachGets;
                if (extraCandies > 0) {
                    share++;
                    extraCandies--;
                }
                System.out.print(share + " ");
            }
        }
        sc.close();
    }
}
