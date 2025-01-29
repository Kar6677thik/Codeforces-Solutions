import java.util.*;
import java.lang.*;
import java.io.*;

class tester
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        
        while (t-- > 0) {
            int h = sc.nextInt();
            int x = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int k = sc.nextInt();
            
            if ((h/x) < (h/y1)) {
                int count1 = 0;
                while (h > 0) {
                    h -= x;
                    count1++;
                }
                System.out.println(count1);
            } else {
                int count2 = 0;
                int laser = 0;
                while (h > 0) {
                    if (laser < k) {
                        h -= y1;
                        laser++;
                        count2++;
                    } else {
                        h -= y2;
                        count2++;
                    }
                }
                System.out.println(count2);
            }
        }
        sc.close();
	}
}
