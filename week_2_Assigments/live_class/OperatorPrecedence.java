package week_02.live_class;

import java.util.Scanner;

public class OperatorPrecedence {
            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("Enter a degree in Fahrenheit :  ");

                double fahrenheit = input.nextDouble();

                double celsius = (5.0 / 9) * (fahrenheit - 32);
                System.out.println("Fahrenhıte " + fahrenheit + " is " +celsius + "in celsius");
            }
        }