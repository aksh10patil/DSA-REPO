// import java.util.Scanner;

// public class Fibnnouci {
//     public static void main(String[] args) {
//       Scanner in = new Scanner(System.in);
//       int n = in.nextInt();
//       int a = 0;
//       int b = 1;
//       int count = 3;

//       while (count <= n) {
//         int temp = b;
//         b = b + 2 * a;
//         a = temp;
//         count ++;
//       }
//       System.out.println(b);

//     }
// }



import java.util.Scanner;

public class Fibnnouci {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a = 0;
    int b = 1;
    int count = 2;

    while(count <= n ) {
     int temp = b;
      b = b + a;
      a = temp;
      count ++;
    }
    System.out.println(b);
  }
}







 