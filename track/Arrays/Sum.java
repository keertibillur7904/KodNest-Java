
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 0;
        System.out.println("Enter the elements are:");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
            sum = sum + a[i];
        }
        System.out.println("The sum of array is: " + sum);
    }
}
