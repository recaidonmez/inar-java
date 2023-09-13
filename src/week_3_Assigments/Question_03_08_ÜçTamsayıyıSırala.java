package week_3_Assigments;

import java.util.Scanner;

public class Question_03_08_ÜçTamsayıyıSırala {
    public static void main(String[]  args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Üç tam sayı giriniz.");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max;

        if (a > c && c > b) {
            System.out.println("Sıralama şöyle olur : " + b + "< " + c + " <" + a);
        }
        if (b > a && a > c) {
            System.out.println("Sıralama şöyle olur : " + c + "< " + a + "< " + b);
        }
        if (b > c && c > a) {
            System.out.println("Sıralama şöyle olur : " + a + "< " + c + "< " + b);
        }
        if (c > b && b > a) {
            System.out.println("Sıralama şöyle olur  :" + a + "< " + b + "< " + c);
        }
        if (c > a && a > b) {
            System.out.println("Sıralama şöyle olu : " + b + "< " + a + "< " + c);
        }
    }
}

    //Üç tam sayı giriniz.
//1
//2
//3
//Sıralama şöyle olur1 2 3