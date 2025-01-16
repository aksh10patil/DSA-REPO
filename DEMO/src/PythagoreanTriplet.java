import java.util.Scanner;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        // Find the largest number
        int max = Math.max(a, Math.max(b, c));

        // Identify the sides
        int x, y, z;
        if (max == a) {
            x = b;
            y = c;
            z = a;
        } else if (max == b) {
            x = a;
            y = c;
            z = b;
        } else {
            x = a;
            y = b;
            z = c;
        }

        // Check if it's a Pythagorean triplet
        if (z * z == x * x + y * y) {
            System.out.println("The numbers form a Pythagorean triplet.");
        } else {
            System.out.println("The numbers do not form a Pythagorean triplet.");
        }

        scn.close();
    }
}