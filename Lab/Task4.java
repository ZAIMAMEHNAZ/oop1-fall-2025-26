package Lab;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.println("Enter second integer (b): ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
