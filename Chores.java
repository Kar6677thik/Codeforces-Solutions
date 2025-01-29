import java.util.Scanner;

public class Chores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tot = sc.nextInt();
        int petya = sc.nextInt();
        int vasya = sc.nextInt();
        int array[] = new int[tot];
        for (int i = 0; i < tot; i++) {
            array[i] = 0;
        }
        int count = 0;
        for (int i = 0; i < tot; i++) {
            int temp;
            for (int j = 0; j < tot; j++) {
                if (array[j] > array[i]) {
                    count++;
                }
                if (count == petya) temp = array[i];
            }
            if (count == petya) {
                temp++;
            }
        }
    }
}
