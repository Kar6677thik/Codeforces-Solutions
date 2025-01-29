import java.util.Scanner;
import java.util.Arrays;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.next();
        String two = sc.next();
        String three = sc.next();
        String opr = one + two;
        char arr1[] = opr.toCharArray();
        char arr2[] = three.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s = "";
        String n = "";
        for (char c : arr1) {
            s += c;
        }
        for (char c : arr2) {
            n += c;
        }
        if (s.equals(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
