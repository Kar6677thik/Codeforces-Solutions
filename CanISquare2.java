import java.util.Scanner;

public class CanISquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String array[] = new String[num];
        for (int i = 0; i < num; i++) {
            int buckets = sc.nextInt();
            long sum = 0;
            for (int j = 0; j < buckets; j++) {
                long capacity = sc.nextLong();
                sum += capacity;
            }
            long sqrt = (long) Math.sqrt(sum);
            if (sqrt * sqrt == sum) {
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
