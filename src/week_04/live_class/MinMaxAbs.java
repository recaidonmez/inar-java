package week_04.live_class;

import java.util.Scanner;

public class MinMaxAbs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min,mid,max;

        int a = 5;
        int b = 12;

        int c = Math.max(a,b);
        int d = Math.min(a,b);

        System.out.printf(" The max number between %d and %d is : %d\n",a,b,c);
        System.out.printf(" The min number between %d and %d is : %d\n",a,b,d);


    }
}
