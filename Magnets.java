import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int array[] = new int[t];
        for (int i = 0; i < t; i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < t-1; i++) {
            int prev = array[i];
            if (prev == array[i+1]) {

            } else {
                prev = array[i+1];
                count++;
            }
        }
        System.out.println(count+1);
        sc.close();
    }
}
