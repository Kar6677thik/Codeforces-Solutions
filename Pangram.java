import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine().toLowerCase();
        if (len>=26) {
            boolean isPresent[] = new boolean[26];
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    int index = ch - 'a';
                    if (!isPresent[index]) {
                        isPresent[index] = true;
                        count++;
                    }
                }
            }
            if (count == 26) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
