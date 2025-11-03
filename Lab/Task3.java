package Lab;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        float celcius = scanner.nextFloat();

        double farhenheit = (celcius * 9 / 5 + 32);

        System.out.println("Temperature in Farhenheit: " + farhenheit);
    }
};
