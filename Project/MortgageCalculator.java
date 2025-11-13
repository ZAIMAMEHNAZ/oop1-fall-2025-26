package Project;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class MortgageCalculator {
    public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);

        double monthlySalary = getValidDouble("Enter your monthly salary:");
        double creditScore = getValidCreditScore("Enter your credit score(0-500):");
        boolean criminalRecord = getValidBoolean("Do you have a criminal record? (true/false):");
     
         boolean eligible = (creditScore>=300) && !criminalRecord;

         if (!eligible){
            System.out.println("Sorry, you are not eligiblle for Loan.");
            System.out.println("Reason: You must have a good credit score of (>=300) and no criminal record.");
            input.close();
       return;
         }

       double principal = getValidDouble("Enter your desired loan amount:");

        if( principal > 2 * monthlySalary ){
                    System.out.println("Loan request denied!");
                    System.out.println("Reason:Loan request must be 2 times of your salary.");
                    input.close();
        return;
        }

        double annualInterestRate = getValidDouble("Enter annual interest rate (in %):");
        int years = (int) getValidDouble("Enter loan period in years:")

        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int totalPayments = years * 12;

        double monthlyMortgagePayment = principal *
    (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,a totlPayments)) /
    (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        double totalPayment = monthlyMortgagePayment * totalPayments;
        double totalInterest = totalPayment - principal;

    Locale bdLocale = Locale.of("en", "BD");
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(bdLocale);
    String formattedMortage = currencyFormat.format(monthlyMortgagePayment);

    System.out.println("Monthly Mortgage Payment:" + formattedMortage);
        input close();

    System.out.println("\n=== Mortgage Summary === ");
    System.out.println("Loan Amount:"+currencyFormat.format(principal));
    System.out.println("Monthly Payment:"+currencyFormat.format(monthlyMortgagePayment));
    System.out.println("Total Payment:"+currencyFormat.format(totalPayment));
    System.out.println("Total Interest:"+currencyFormat.format(totalInterest));

    private static double getValidDouble(scanner input, string message);
        while(true)
    {
        System.out.print(message);
        if (input.hasNextDouble()) {
            return input.nextDouble();
        } else {
            System.out.println("Invalid input!Please enter a numeric value.");
            input.next();
        }
    }
    }

    private static double getValidCreditScore(Scanner input){
             while(true){
                System.out.println("Enter your credit score (0-500):");
                if(input.hasNextDouble()){
                    double score = input.nextDouble();
                if(creditScore >= 0 && creditScore <= 500){
                    return creditScore;
                    else
                     System.out.println("Credit score must be between 0 and 500");
                } else {
                System.out.println("Invalid input!Please enter a numeric value 0 to 500.");
                    input.next();
                }
             }
     }

    private static boolean getValidBoolean(Scanner input, String message) {
        while (true) {
            System.out.println(message);
            if (input.hasNextBoolean()) {
                return input.nextBoolean();
            } else {
                System.out.println("Invalid input!Please type 'true' or 'false' ");
                input.next();
            }
        }
    }
};
