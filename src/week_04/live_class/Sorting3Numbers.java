package week_04.live_class;

import java.util.Scanner;

public class Sorting3Numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min, mid, max;

        System.out.println("please enter three numberse:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


        int tempMax = Math.max(num1, num2);
        max = Math.max(tempMax, num3);

        System.out.printf("The numbers are %d, %d, %d\n", num1, num2, num3);
        //System.out.printf("The max number is %d", max(num1,num2,num3));
        System.out.printf("The max number is %d\n", max);

        //----------------------------------

        int tempMin = Math.min(num1, num2);
        min = Math.min(tempMin, num3);

        //System.out.printf("The max number is %d", max(num1,num2,num3));
        System.out.printf("The min number is %d\n", min);

        //----------------------------------

        // && => (true && false) => false
        // && => (true && true) => true
        // && => (false && false) => false

        if (num1 != max && num1 != min) {
            mid = num1;
        } else if (num2 != max && num2 != min) {
            mid = num2;
        } else {
            mid = num3;
        }


        //System.out.printf("The max number is %d", max(num1,num2,num3));
        System.out.printf("The mid number is %d\n", mid);


    }


    public static int max(int a, int b, int c) {
        int tempMax = Math.max(a, b);
        return Math.max(tempMax, c);
    }
}
