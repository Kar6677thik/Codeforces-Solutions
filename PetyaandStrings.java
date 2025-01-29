import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.next().toLowerCase();
        String two = sc.next().toLowerCase();
        int resone = one.compareTo(two);
        if (resone < 0) {
            System.out.println("-1");
        }
        else if (resone > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        sc.close();
    }
}
