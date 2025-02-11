import java.util.Scanner;

public class FindElementinArray {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int [] arr = new int[]{10, 20, 30, 40};

        for ( int i = 0; i < arr.length; i++) {

        }

        int data = scn.nextInt();
        int idx = -1;

        for ( int i = 0; i < arr.length; i++) {
            if ( arr[i] == data) {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
