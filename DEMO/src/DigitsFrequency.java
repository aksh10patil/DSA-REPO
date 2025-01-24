import java.util.Scanner;

public class DigitsFrequency {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getdigitsFrequency(n , d);
        System.out.println(f);
    }

        public static int getdigitsFrequency( int n , int d) {
            int rv = 0;

            while ( n > 0 ) {
                int dig = n % 10;
                n = n / 10;

                if ( dig == d) {
                    rv++;
                }
            }
            return rv;   
        }
     }

