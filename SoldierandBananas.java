import java.util.Scanner;;

public class SoldierandBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); //cost of the first banana
        int n = sc.nextInt(); //money he had rn
        int w = sc.nextInt(); // no. of bananas he want
        //money after the first banana
        int total = 0;
        for (int i = 1; i <= w; i++) {
            total += i*k;
        }
        //amount he borrows
        int borrow = total - n;
        if (borrow > 0) {
        System.out.println(borrow);
        } else {
            System.out.println("0");
        }
        sc.close();
    }
}
