import java.util.Scanner;

public class ToMyCritics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int array[][] = new int[num][3];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < num; i++) {
            int x = array[i][0], y = array[i][1], z = array[i][2];
            if (x+y >= 10 || y + z >= 10 || x + z >= 10) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
