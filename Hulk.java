import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num ; i++) {
            if (i%2==0 && i<num) {
                System.out.print("I love that ");
            } else if (i%2 !=0 && i <num) {
                System.out.print("I hate that ");
            } else if (i%2==0) {
                System.out.print("I love it ");
            } else {
                System.out.print("I hate it ");
            }
        }
        sc.close();
    }
}
