package Lab;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter price: ");
        double price = scanner.nextDouble();

        double discount = price * 0.15;

        System.out.println("Final price after discount: " + discount);

    }

}
