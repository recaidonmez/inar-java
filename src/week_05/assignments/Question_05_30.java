package week_05.assignments;

import java.util.Scanner;

public class Question_05_30 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an amount, the
        // annual interest rate and the number of months
        System.out.print("Enter an amount (e.g., 100): ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual interest rate (e.g., 5): ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of months (e.g., 6): ");
        int months = input.nextInt();

        // Compute monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Compute amount in the savings account after the given month
        double compoundValue = 0; // Accumulates compount value
        for (int m = 1; m <= months; m++) {
            compoundValue = (amount + compoundValue) * (1 + monthlyInterestRate);
        }

        // Display result
        System.out.printf(
                "Amount in savings account after " +
                        months + " months: $%.2f\n", compoundValue);
    }
}