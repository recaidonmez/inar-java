package week_3_Assigments;

import java.util.Scanner;

public class Question_03_25_Kesişme_noktası {
    public static void main(String[] args ){

        Scanner input = new Scanner(System.in);

        System.out.println("x1y1 x2y2 x3y3 x4y4 degerlerini girin");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();


        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = (y1 - y2) * x1 - (x1 - x2) * y1;
        double d = y3 - y4;
        double e = -(x3 - x4);
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        double x =(e*d)-(b*c) / (a*d) - (b*c);
        double y =(a*f) - ( e*c ) /(a*d) -(b*c);
    }
}
