import java.util.Scanner;
import java.util.Arrays;
public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int l = arr[arr.length-1];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += l-arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}