package Week_5_Assigments;

import java.util.Scanner;

public class Question_05_47 {public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter the first 12 digits of an ISBN-13 as string
    System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
    String isbn = input.nextLine();

    // Verify string length
    if (isbn.length() != 12) {
        System.out.println(isbn + " is an invalid input");
        System.exit(1);
    }

    int checksum = 0; // Holds the checksum value

    //	Calculate the checksum
    for (int i = 0; i < isbn.length(); i++) {
        checksum += i % 2 == 0 ? 3 * Integer.parseInt(isbn.charAt(i) + "")
                : Integer.parseInt(isbn.charAt(i) + "");
    }
    checksum = 10 - checksum % 10;

    // Print the result if checksum is 10, replace it with 0
    System.out.println("The ISBN-13 number is " + isbn +
            (checksum == 10 ? 0 : checksum));
}
}
