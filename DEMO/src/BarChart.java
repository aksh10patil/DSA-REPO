import java.io.*;
import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int max = arr[0]; // we assume the zeroth number is the largest hence this code...
        for ( int i = 1; i < arr.length; i++) {
            if ( arr[i] > max) {
                max = arr[i];
            }
        }
        for ( int floor = max; floor >= 1; floor--) {
            for ( int i = 0; i < arr.length; i++) {
                if ( arr[i] >= floor) {
                    System.out.print("*\t");  // Use System.out.print here
                } else {
                    System.out.print("\t");  // Use System.out.print here
                }
            }
            System.out.println(); // Move to the next floor
        }
    }
}