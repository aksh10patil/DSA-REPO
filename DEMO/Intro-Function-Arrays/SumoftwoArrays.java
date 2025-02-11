import java.util.Scanner;

public class SumoftwoArrays {

    public static void main(String[] args) {
        

        Scanner scn = new Scanner(System.in);

        //First Array
        int n1 = scn.nextInt(); // n1 = number elements of the array
        int[] a1 = new int[n1]; // [n1] = makes the spaces you specified
        for ( int i = 0; i < a1.length; i++) {
            a1[i] = scn.nextInt();
        }


        // Secound Array
        int n2 = scn.nextInt(); // n1 = number elements of the array
        int[] a2 = new int[n2]; // [n1] = makes the spaces you specified
        for ( int i = 0; i < a2.length; i++) {
            a2[i] = scn.nextInt();
        }

        // Intializing the sum Variable 
        int[] sum = new int[n1 > n2?n1:n2];  // using iterenay operator like true or false statement

        int c = 0; // c is the carry value which gets carried to the next array postion

        // Assigning the designated values to the i,j,k
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        while ( k >= 0) {
            int d = c;

            if ( i >= 0) {
                d += a1[i];
            }
            if ( j >= 0) {
                d += a2[j];
            }

            c = d / 10;

            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        // if carry is left till the end we need to print carry aswell.

        if ( c != 0) {
            System.out.println(c);
        }

        // Wont give index, directly value
        for (int val : sum) {
            System.out.print(val);
        }
    }
}
