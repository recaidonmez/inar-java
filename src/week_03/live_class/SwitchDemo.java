package week_03.live_class;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter filing status
        System.out.print("(0-single filer, 1-married jointly or qualifying widow(er),2-married separately," +
                "\n 3-head of household) Enter the filing status: ");

        int status = input.nextInt();

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();


        // Compute tax
        double tax = 0;

        switch (status) {
            case 0:
                if (income <= 8350)
                    tax = income * 0.10;
                else if (income <= 33950)
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                else if (income <= 82250)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                else if (income <= 171550)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                            (income - 82250) * 0.28;
                else if (income <= 372950)
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                            (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
                else
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                            (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
                break;
            case 1:
                System.out.println("Compute tax for status 1");
                break;
            case 2:
                System.out.println("Compute tax for status 2");
                break;
            case 3:
                System.out.println("Compute tax for status 3");
                break;
            default:
                System.out.println("invalid status");
                break;
        }

        // Display the result
        System.out.println("Tax is -> " + tax);
    }
}
