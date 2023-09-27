package week_04.live_class;

import java.util.Scanner;

public class ExchangeValues {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.printf("The values are \na : %d\nb : %d\n",a,b);
        // a => 7
        // b => 5

        int c;
//        c = a;
//        a = b;
//        b = c;

        a = a + b; //  * 35
        b = a - b; //  /    35 / 7 = 5
        a = a - b; //  /   35 / 5 = 7

        System.out.printf("The values are \na : %d\nb : %d\n",a,b);
        //----------------------------
        Scanner input = new Scanner(System.in);
        input.nextInt();
        Math.random();

    }
}
