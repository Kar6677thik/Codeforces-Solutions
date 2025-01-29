import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String num2 = sc.next();
        String newString = "";
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == num2.charAt(i)) {
                newString += "0";
            } else {
                newString += "1";
            }
        }
        System.out.println(newString);
        sc.close();
    }
}
