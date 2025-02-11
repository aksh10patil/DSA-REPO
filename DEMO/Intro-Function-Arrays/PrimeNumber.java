import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int lower = scn.nextInt();
        int higher = scn.nextInt();

        for ( int n = lower; n <= higher; n++) {
            int count = 0;

            for ( int div = 2; div * div <= n; div++) {
                if ( n % div == 0 ) {
                    count++;
                    break;
                }
            }

            if ( count == 0 ) {
                System.out.println(n);
            }
        }

        scn.close();

       
    }
}