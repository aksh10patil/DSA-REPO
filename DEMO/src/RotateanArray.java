import java.util.Scanner;

public class RotateanArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a1 = new int[n1];

        for ( int i = 0; i < a1.length; i++ ) {
            a1 [i] = scn.nextInt();
        }
        int rotate [] = new int[n1];

        int r = scn.nextInt();

        for ( int i = 0; i < n1; i++) {
            
            rotate[i] = a1[ n1 - r - i];
        }

        for ( int val : rotate ) {
            System.out.print(val + "");
        }
    }
}
