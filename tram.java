import java.util.Scanner;

public class tram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			int out = sc.nextInt();
			int in = sc.nextInt();
			total = total + in - out;
			if (total > max) {
				max = total;
			}
		}
		System.out.println(max);
		sc.close();
	}
}