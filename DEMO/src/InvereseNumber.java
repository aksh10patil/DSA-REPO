import java.util.Scanner;

public class InvereseNumber {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


        int n = scn.nextInt();

        int inv = 0;
        int op = 1;
        while ( n != 0 ) {
            int od = n % 10;
            int id = op;
            int ip = od;
                // Make changes to inv using ip and id 
                inv = inv + id * ( int )Math.pow(10 , ip - 1);

                n = n / 10;
                op++;
        }

        System.out.println(inv);















        // int n = scn.nextInt();

        // int inv  = 0;
        // int op = 1;  //original position
        // while ( n != 0) {
        //     int od = n % 10; //original digit
        //     int id = op;     //inverse digit , original postion
        //     int ip = od;     //inverse product , original digit 
 
        //     // make changes to inv using ip and id
        //     inv = inv + id * (int)Math.pow(10, ip-1);

        //     n = n / 10;
        //     op++;
        // }
        // System.out.println(inv);   
    }
}
