import java.util.Scanner;

public class StoneontheTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStones = sc.nextInt();
        String stones = sc.next();

        int count = 0;
        for (int i = 0; i < numStones - 1; i++) {
            if (stones.charAt(i) == stones.charAt(i + 1)) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
