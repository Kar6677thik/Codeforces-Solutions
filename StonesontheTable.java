import java.util.Scanner;

public class StonesontheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numStones = sc.nextInt();
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        int count = 0;
        if (numStones > 2) {
            for (int i = 0; i < numStones-2; i++) {
                if ((sb.charAt(i) == sb.charAt(i+1)) && (sb.charAt(i) != sb.charAt(i+2))) {
                    sb.deleteCharAt(i+1);
                    count++;
                }
            }
            System.out.println(count);
        }
        else {
            System.out.println("1");
        }
        sc.close();
    }
}
