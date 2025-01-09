import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Q : Is to find the largest number 
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c> max) {
            max = c;
        }

        System.out.println(max);
        
    }
}