import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float k = sc.nextFloat();
        float l = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float p = sc.nextFloat();
        float nl = sc.nextFloat();
        float np = sc.nextFloat();
        float toasts = (k*l)/nl;
        float limes = c*d;
        float salt = p/np;
        int ans = (int)(Math.min(toasts, Math.min(limes, salt))/n);
        System.out.println(ans);
        sc.close();
    }
}
