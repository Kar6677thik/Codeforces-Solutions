import java.util.Scanner;
import java.util.Arrays;
public class MediumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int arr[] = new int[3];
        while (t>0) {
            for (int i = 0; i<3; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[1]);
            t--;
        }
        sc.close();
    }
}
