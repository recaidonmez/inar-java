package week_05.assignments;

import java.util.Scanner;

public class Question_05_31 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an amout, the
        // annual percentage yield and the number of months
        System.out.print("Enter the initial deposit amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double percentageYield = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();

        // Display header
        System.out.println("Month  CD Value");
        // Compute and display CD worth for the number of months
        for (int m = 1; m <= months; m++) {
            amount += amount * (percentageYield / 1200);
            System.out.printf("%-7d%.2f\n", m, amount);
        }
    }
}