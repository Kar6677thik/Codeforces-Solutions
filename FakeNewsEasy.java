import java.util.Scanner;

public class FakeNewsEasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] a = {'h', 'e', 'i', 'd', 'i'};
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a[k]) {
                k++;
            }
        }
        if (k == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}

