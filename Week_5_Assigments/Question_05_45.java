package Week_5_Assigments;

import java.util.Scanner;

public class Question_05_45 {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double mean, 				// Holds the mean
            deviation, 		// Holds the standard deviation
            number;				// Holds user input
    mean = deviation = 0;	// Set mean and deviation to 0

    // Prompt the user to enter ten numbers
    System.out.print("Enter ten numbers: ");

    // Compute mean and standard deviation
    for (int i = 1; i <= 10; i++) {
        number = input.nextDouble();
        mean += number;
        deviation += Math.pow(number, 2);
    }
    deviation =  Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / (10 - 1));
    mean /= 10;

    // Display results
    System.out.println("The mean is " + mean);
    System.out.printf("The standard deviation is %.5f\n", deviation);
}
}
