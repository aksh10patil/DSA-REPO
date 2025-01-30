import java.util.Scanner;

public class ReverseanArray {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] a1 = new int[n1];

        for ( int i = 0; i <a1.length; i++) {
            a1[i] = scn.nextInt();
        }

        int [] ans = new int[n1];

        for ( int i = 0; i < n1; i++ ) {
            ans[i] = a1[n1 - 1 - i]; // Lets say for the first value  n1 - 1 - i = 5 - 1 - 0 = 4 = ans[0] 
                                    // SIMPLY means that if ans is 1 then the a1 is at 5th postion
        }

        for ( int val : ans) {
            System.out.print(val + " ");
        }
    }
}
