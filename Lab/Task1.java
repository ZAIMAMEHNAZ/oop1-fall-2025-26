package Lab;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the score of student 1");
        double score1 = scanner.nextDouble();

        System.out.println("Enter the score of student 2");
        double score2 = scanner.nextDouble();

        System.out.println("Enter the score of student 3");
        double score3 = scanner.nextDouble();

        double sum = score1 + score2 + score3;
        double average = sum / 3;

        System.out.println("Total marks: " + sum);
        System.out.println("Average: " + average);

    }

};
