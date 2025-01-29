import java.util.Arrays;
import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            s = new String(arr);
            if (n == 5 && s.equals("Timru")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
        
    }
}

