
import java.util.Scanner;

public class Minimum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the elements are:");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("the array is :");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
        int min = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("the min element is:" + min);

        scanner.close();

    }
}
