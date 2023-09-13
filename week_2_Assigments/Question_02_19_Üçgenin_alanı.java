package week_2_Assigments;

import java.util.Scanner;

public class Question_02_19_Üçgenin_alanı {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir kenar uzunluğu girin");
        double x1 = input.nextDouble();
        System.out.println("Lütfen bir kenar uzunluğu girin");
        double x2 = input.nextDouble();
        System.out.println("Lütfen bir kenar uzunluğu girin");
        double x3 = input.nextDouble();
        System.out.println("Lütfen bir kenar uzunluğu girin");
        double y1 = input.nextDouble();
        System.out.println("Lütfen bir kenar uzunluğu girin");
        double y2 = input.nextDouble();
        System.out.println("Lütfen bir kenar uzunluğu girin");
        double y3 = input.nextDouble();

        double s = (x1 + x2 + x3) / 2;

        // Math.sqrt() -> karekök alma

        double area = (s *(s - x1) * (s - x2) * (s - x3));

        System.out.println("Üçgenin alanı    :"  + s);

        System.out.println("Üçgenin alanı    :"  + Math.sqrt(area));

        //Lütfen bir kenar uzunluğu girin
        //1,5
        //Lütfen bir kenar uzunluğu girin
        //-3,4
        //Lütfen bir kenar uzunluğu girin
        //4,6
        //Lütfen bir kenar uzunluğu girin
        //5
        //Lütfen bir kenar uzunluğu girin
        //9,5
        //Lütfen bir kenar uzunluğu girin
        //-3,4
        //Üçgenin alanı    :33,6 olmalı

    }
}