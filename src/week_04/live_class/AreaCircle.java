package week_04.live_class;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        /**
         * @author Emir
         *
         * Find the area of a circle with x cm radius
         * Pi * r * r
         * 1 - Round to the upper integer
         * 2 - Round to the lower integer
         * 3 - Round to the closest integer
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        double radius = input.nextDouble();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);

        System.out.println(Math.ceil(area));
        System.out.println(Math.floor(area));
        System.out.println(Math.round(area));
    }
}
