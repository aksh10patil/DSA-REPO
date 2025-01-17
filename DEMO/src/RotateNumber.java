import java.util.*;


public class RotateNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        // inorder to count the number of digits present in the n

        int temp = n;
        int nod =  0;

        while ( temp > 0) {
            temp = temp / 10;
            nod++; // so it stores the value of digits ( number of digits = nod )
        }


        int div = 1;
        int mult = 1;

        for ( int i = 0; i <= nod; i++) {
                if ( i <= k ) {
                    div = div * 10;
                } else {
                    mult = mult * 10;
                }
        }

        int q = n / div ;
        int r = n % div;

        int rot = r * mult + q;
        System.out.println(rot);
        scn.close();


    }
   
    
}
