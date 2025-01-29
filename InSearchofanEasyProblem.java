import java.util.Scanner;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[t];
        int count = 0;
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 1) {
                count++;
                System.out.println("HARD");
                break;
            }
        }
        if (count == 0) {
            System.out.println("EASY");
        }
        sc.close();
    }
}
