import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int array[] = new int[(inp.length()/2)+1];
        int index = 0;
        for (int i = 0; i < inp.length(); i += 2) {
            array[index] = inp.charAt(i) - '0';
            index++;
        }
        for(int i=0; i<array.length-1; i++) {
            for(int j=0; j<array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        int ind = 0;
        for(int i = 0; i < inp.length(); i+=2) {
            System.out.print(array[ind]);
            if(i<inp.length()-1) {
                System.out.print("+");
            }
            ind++;
        }
        sc.close();
 
    }
}
