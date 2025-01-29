import java.util.Scanner;

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int array[] = new int[4];
        while (test-- > 0) {
            for (int i = 0; i < 4; i++) {
                array[i] = sc.nextInt();
            }
            int one = Math.min(array[0], array[1]);
            int two = Math.min(array[2], array[3]);
            int win1 = Math.max(array[0], array[1]);
            int win2 = Math.max(array[2], array[3]);
            if ((win1 > two) && win2 > one) {
                System.out.println("YES");
            } 
            else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
