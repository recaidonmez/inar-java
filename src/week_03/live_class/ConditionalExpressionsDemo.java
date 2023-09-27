package week_03.live_class;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ConditionalExpressionsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 1012354);

        int c = 10;
        System.out.println("first c  " + c);
        c = 5;
        System.out.println("second c  " + c);
        System.out.print("Enter the coordinates of three points separated " + "by spaces like x1 y1 x2 y2 x3 y3: ");


        if (c == 5) {
            int number = 10;
            System.out.println(number);
        }
        int b = 5;
        int a;
        a = b += c = 4;
        System.out.println(a);
        System.out.println(b);
        System.out.println("third c " + c);
    }
}
