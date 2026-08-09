
import java.util.Scanner;

public class P14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter byte value:");
        byte a = sc.nextByte();
        System.out.println("Byte value :" + a);

        System.out.println("enter short value:");
        short b = sc.nextShort();
        System.out.println("short value :" + b);

        System.out.println("enter int value:");
        int c = sc.nextInt();
        System.out.println("int value :" + c);

        System.out.println("enter long value:");
        long d = sc.nextLong();
        System.out.println("long value :" + d);

        System.out.println("enter float value:");
        float e = sc.nextFloat();
        System.out.println("float value :" + e);

        System.out.println("enter double value:");
        double f = sc.nextDouble();
        System.out.println("double value :" + f);

        System.out.println("enter boolean value:");
        boolean g = sc.nextBoolean();
        System.out.println("boolean value :" + g);

        System.out.println("enter char value:");
        char h = sc.next().charAt(0);
        System.out.println("char value :" + h);

        System.out.println("enter string value:");
        String i = sc.next();
        System.out.println("string value :" + i);
    }
}
