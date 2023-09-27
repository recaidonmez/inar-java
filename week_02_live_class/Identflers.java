package week_02_live_class;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Identflers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for seconds: ");
        int seconds = input.nextInt();

        int minutes = seconds / 60;

        System.out.println(minutes + " minutes");

        int remainingSecond = seconds % 60;

        System.out.println(remainingSecond);

        System.out.println("You entered " + seconds + " second and it is " +
 minutes + " minutes and " + remainingSecond + "seconds.");

    }

}


