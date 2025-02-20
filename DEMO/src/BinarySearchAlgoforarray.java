import java.util.Scanner;

public class BinarySearchAlgoforarray { 
    public static void main(String[] args) {
        int[] arr = { 10, 20 , 30 , 40 , 50 , 60 , 70 , 80, 90, 100};
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int l = 0;
        int h = arr.length - 1;

        while ( l <= h) {
            int m = (l + h) / 2;
            if ( n > arr[m]) {
                l = m + 1;
            } else if ( n < arr[m]) {
                h = m - 1; 
            } else {
                System.out.println(m);
                return;
            }
        }
        System.out.println("No value was found in the array");   
    }
}
