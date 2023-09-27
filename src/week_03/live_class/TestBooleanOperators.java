package week_03.live_class;

import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 and 3.");
        }

        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3.");
        }

        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3 , but not both.");
        }
        boolean value = !(true && true); //  !true || !true
        System.out.println(value);
//        int number = 70;
        boolean value2 = !(number % 5 == 0 && number % 7 == 0);
        System.out.println(value2);
        value2 = number % 5 != 0 || number % 7 != 0;
        System.out.println(value2);
    }
}
