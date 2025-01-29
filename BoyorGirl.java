import java.util.Scanner;

public class BoyorGirl {
    public static boolean[] map = new boolean[26];

    public static String removeDuplicates(String str, int idx) {
        if (idx == str.length()) {
            return "";
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            return removeDuplicates(str, idx+1);
        } else {
            map[currChar - 'a'] = true;
            return currChar + removeDuplicates(str, idx+1);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String removed = removeDuplicates(str, 0);
        if (removed.length()%2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}
