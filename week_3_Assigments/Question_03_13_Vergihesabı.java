package week_3_Assigments;

import java.util.Scanner;

public class Question_03_13_Vergihesabı {


        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            // Prompt the user to enter filing status
            System.out.print("((0-bekar filtre, 1-evli veya \" +\n" +
                    "                \"Nitelikli dullar), 2-ayrı evli, 3-Aile reisi\" +\n" +
                    "                \"hane) Dosyalama durumunu girin: ");
            int status = input.nextInt();
            // Prompt the user to enter taxable income
            System.out.print("Enter the taxable income: ");
            double income = input.nextDouble();

            // Compute tax
            double tax = 0;
            switch (status) {
                case 0: // Compute tax for single filers
                    switch (status) {
                        case 0: // Compute tax for single filers
                            tax += (income <= 8350) ? income * 0.10 : 8350 * 0.10;
                            if (income > 8350)
                                tax += (income <= 33950) ? (income - 8350) * 0.15 :
                                        25600 * 0.15;
                            if (income > 33950)
                                tax += (income <= 82250) ? (income - 33950) * 0.25 :
                                        48300 * 0.25;
                            if (income > 82250)
                                tax += (income <= 171550) ? (income - 82250) * 0.28 :
                                        89300 * 0.28;
                            if (income > 171550)
                                tax += (income <= 372950) ? (income - 171550) * 0.33 :
                                        201400 * 0.33;
                            if (income > 372950)
                                tax += (income - 372950) * 0.35;
                            break;
                        case 1: // Compute tax for married file jointly or qualifying widow(er)
                            tax += (income <= 16700) ? income * 0.10 : 16700 * 0.10;
                            if (income > 16700)
                                //tax += (income <= 67900) ? (income - 16700) * 0.15:
                                if (income > 372950)
                                    tax += (income - 372950) * 0.35;
                            break;
                        case 2: // Compute tax for married separately

                            tax += (income <= 8350) ? income * 0.10 : 8350 * 0.10;
                            if (income > 8350)
                                tax += (income <= 33950) ? (income - 8350) * 0.15 :
                                        (33950 - 8350) * 0.15;
                            if (income > 33950)
                                tax += (income <= 68525) ? (income - 33950) * 0.25 :
                                        (68525 - 33950) * 0.25;
                            if (income > 68525)
                                tax += (income <= 104425) ? (income - 68525) * 0.28 :
                                        (104425 - 68525) * 0.28;
                            if (income > 104425)
                                tax += (income <= 186475) ? (income - 104425) * 0.33 :
                                        (186475 - 104425) * 0.33;
                            if (income > 186475)
                                tax += (income - 186475) * 0.35;
                            break;
                        case 3: // Compute tax for head of household
                            tax += (income <= 11950) ? income * 0.10 : 11950 * 0.10;
                            if (income > 11950)
                                tax += (income <= 45500) ? (income - 11950) * 0.15 :
                                        (45500 - 11950) * 0.15;
                            if (income > 45500)
                                tax += (income <= 117450) ? (income - 45500) * 0.25 :
                                        (117450 - 45500) * 0.25;
                            if (income > 117450)
                                tax += (income <= 190200) ? (income - 117450) * 0.28 :
                                        (190200 - 117450) * 0.28;
                            if (income > 190200)
                                tax += (income <= 372950) ? (income - 190200) * 0.33 :
                                        (372950 - 190200) * 0.33;
                            if (income > 372950)
                                tax += (income - 372950) * 0.35;
                            break;
                        default:
                            System.out.println("Error: invalid status");
                    }
                default:
                    System.out.println("Error: invalid status");
                    System.exit(1);

                    // Display the result
                    System.out.println("Tax is " + (int) (tax * 100) / 100.0);
                    System.out.println("Tax is " + (int) (tax * 100) / 100.0);
            }
        }
    }

