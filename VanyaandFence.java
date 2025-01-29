import java.util.Scanner;

public class VanyaandFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int height = sc.nextInt();
        int array[] = new int[num];
        int count = 0;
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
            if (array[i] <= height) {
                count++;
            }
            else {
                count += 2;
            }
        }
        sc.close();
        System.out.println(count);
    }
}
