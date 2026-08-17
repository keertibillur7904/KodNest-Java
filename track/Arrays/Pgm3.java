
import java.util.Scanner;

public class Pgm3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter array elements:");
        int[] a = new int[5];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println(" the element are:");
        for (int i = 0; i <= 4; i++) {
            System.out.println(a[i]);
        }
        scan.close();

    }
}
