import java.util.Scanner;

public class OddOneOut {
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
                int a = array[i][0];
                int b = array[i][1];
                int c = array[i][2];
                if (a != b && a != c) {
                    System.out.println(a);
                }
                else if (b != a && b != c) {
                    System.out.println(b);
                } else {
                    System.out.println(c);
                }
            }
            sc.close();
        }
}
