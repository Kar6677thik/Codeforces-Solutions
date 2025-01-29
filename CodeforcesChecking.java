import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            String s = "codeforces";
            boolean h = false;
            char arr[] = s.toCharArray();
            char c = sc.next().charAt(0);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == c) {
                    h = true;
                    break;
                } else {
                    h = false;
                }
            }
            if (h == true) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
        sc.close();
    }
}
