import java.util.Scanner;
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        for(int i = 0; i < size; i++) {
            array[i] = sc.next();
        }
        for (int i = 0; i < size; i++) {
            char one = array[i].charAt(0);
            char last = array[i].charAt(array[i].length()-1);
            int len = array[i].length()-2;
            if (array[i].length() > 10) {
                System.out.println(one + Integer.toString(len) + last);
            }
            else {
                System.out.println(array[i]);
            }
        }
        sc.close();
    }
}
