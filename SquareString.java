import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            if (str.length()%2 != 0) {
                System.out.println("NO");
            } else {
                if (str.substring(0,str.length()/2).equals(str.substring(str.length()/2))) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
