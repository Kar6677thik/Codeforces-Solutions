import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String tr = "";
        for (int i = t.length()-1; i >= 0; i--) {
            tr += t.charAt(i);
        }
        if(s.equals(tr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
