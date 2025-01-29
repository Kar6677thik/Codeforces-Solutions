import java.util.Scanner;

public class CanISquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String array[] = new String[num];
        for (int i = 0; i < num; i++) {
            int buckets = sc.nextInt();
            int arr[] = new int[buckets];
            int sum = 0;
            for (int j = 0; j < buckets; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            int sqrt = (int) Math.sqrt(sum);
            if(sum == sqrt * sqrt) {
                array[i] = "Yes";
            } else {
                array[i] = "No";
            }
        }
        for (String str : array) {
            System.out.println(str);
        }
        sc.close();
    }
}
