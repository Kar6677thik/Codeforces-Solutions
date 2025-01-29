import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int array[][] = new int[num][3];
        for (int i =0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int count1= 0, count2 = 0, count3 = 0;
        for (int i = 0; i < num; i++) {
            count1 += array[i][0];
            count2 += array[i][1];
            count3 += array[i][2];
        }
        if (count1 == 0 && count2 == 0 && count3 == 0 ) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        sc.close();
    }
}
