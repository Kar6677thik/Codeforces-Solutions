import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int uppercase = 0;
        int lowercase = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).toUpperCase() == str.substring(i, i + 1)) {
                uppercase++;
            } else {
                lowercase++;
            }
        }
        if (str.substring(str.length() - 1) == str.substring(str.length() - 1).toUpperCase()) {
            uppercase++;
        }
        if (uppercase > lowercase) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
        sc.close();
    }
}
