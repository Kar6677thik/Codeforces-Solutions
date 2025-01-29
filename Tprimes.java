import java.util.Scanner;

public class Tprimes {
	
	public static boolean isTPrime(long k) {
		int count = 1;
		for (long i = 1; i <= k/2; i++) {
			if (k%i==0) {
				count++;
			}
		}
		if (count==3) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long k = sc.nextLong();
			if(isTPrime(k)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}