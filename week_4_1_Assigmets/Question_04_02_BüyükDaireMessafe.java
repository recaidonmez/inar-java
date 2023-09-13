package week_4_1_Assigmets;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Question_04_02_BüyükDaireMessafe {
    public static void main(String[] args ){

        Scanner input =new Scanner(System.in);

        System.out.println("1. İki noktanın enlem ve boylamını girin:");
        double x1 =input.nextDouble();
        double y1 =input.nextDouble();

        System.out.println("2 .İki noktanın enlem ve boylamını girin:");
        double x2 =input.nextDouble();
        double y2 =input.nextDouble();

        double xx1 = Math.abs(x1);
        double yy1 = Math.abs(y1);
        double xx2 = Math.abs(x2);
        double yy2 = Math.abs(y2);;

        double radius = 6371.0; // Dünyanın kilometre cinsinden yarıçapı



        double d = radius * (sin(xx1) * sin(xx2) + cos(xx1) * cos(xx2) * cos(yy1 - yy2));

        double radians = Math.toRadians(d);

        System.out.println("1. İki noktanın enlem ve boylamını" +x1+ ","+y1);
        System.out.println("2. İki noktanın enlem ve boylamını" +x2+ ","+y2);
        System.out.println(""+radians+"");

        }


    }

