import java.util.Scanner;

public class Word2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int uppercase = 0;
        int lowercase = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                uppercase++;
            }
            else {
                lowercase++;
            }
        }
        if (uppercase > lowercase) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
        sc.close();
    }
}
