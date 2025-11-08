package Project;

import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" === Mortgage Calculator === ");

        System.out.print("Enter loan amount:");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate:");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan period(in years):");
        int years = scanner.nextInt();

        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int totalPayments = years * 12;
        double monthlyMortgagePayment = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments))
                / Math.pow(1 + monthlyInterestRate, totalPayments) - 1;
        double totalPayment = monthlyMortgagePayment * totalPayments;
        double totalInterest = totalPayment - principal;

        System.out.println(" === Mortgage Summary === ");
        System.out.println("Loan Amount:" + principal);
        System.out.println("Monthly Payment:" + monthlyMortgagePayment);
        System.out.println("Total Payment:" + totalPayment);
        System.out.println("Total Interest:" + totalInterest);

    }

};
