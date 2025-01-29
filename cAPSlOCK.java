import java.util.Scanner;

public class cAPSlOCK {
    public static boolean isStringUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isUpperCase(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if ((isStringUpperCase(str.substring(0,1))==false) &&(isStringUpperCase(str.substring(1))==true)) {
            System.out.println(str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase());
        }
        else if (str.equals(str.toUpperCase())) {
            System.out.println(str.toLowerCase());
        } else {
            System.out.println(str);
        }
        sc.close();
    }
}
