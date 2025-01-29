import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next().toLowerCase();
        char array[] = new char[inp.length()];
        for (int i = 0; i < inp.length(); i++) {
            array[i] = inp.charAt(i);
        }
        for (int i = 0; i < inp.length(); i++) {
            char ch = inp.charAt(i);
            if (ch == 'a' || ch == 'o' || ch == 'y' || ch == 'e' || ch == 'u' || ch == 'i') {
                
            }
            else {
                System.out.print(".");
                System.out.print(ch);
            } 
        }
        sc.close();
    }
}
