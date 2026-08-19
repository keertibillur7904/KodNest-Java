
import java.util.Scanner;

public class ThreeDArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[][][] = new int[3][3][5];
        System.out.print("Enter the 15 values : ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 4; k++) {
                    a[i][j][k] = scanner.nextInt();
                }

            }
        }
        System.out.println("The array elements are : ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                for (int k = 0; k <= 4; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
