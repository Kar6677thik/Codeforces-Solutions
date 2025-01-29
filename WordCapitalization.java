import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        System.out.println(inp.substring(0, 1).toUpperCase() + inp.substring(1));
        sc.close();
    }
}
