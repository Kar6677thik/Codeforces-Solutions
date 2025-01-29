import java.util.Arrays;
import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[3];
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        Arrays.sort(array);
        System.out.println(Math.abs(array[0] - array[1]) + Math.abs(array[1] - array[2]));
        sc.close();
    }
}
