package week_2_Assigments;

import java.util.Scanner;

public class Question_02_15_Geometri_ikiKonum {
    public static void main(String[] args){

        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen birinci  uzunluğu girin");

        double x1 = input.nextDouble();

        System.out.println("Lütfen ikinci  uzunluğu girin");

        double y1 = input.nextDouble();

        System.out.println("Lütfen üçüncü  uzunluğu girin");

        double x2 = input.nextDouble();

        System.out.println("Lütfen dördüncü  uzunluğu girin");

        double y2 = input.nextDouble();

        double a = Math.pow((x2-x1),2) + Math.pow( (y2-y1),2);


        System.out.println("İki nokta Arasında mesafe :" + Math.sqrt(a));

        //Lütfen birinci  uzunluğu girin
        //1,5
        //Lütfen ikinci  uzunluğu girin
        //-3,4
        //Lütfen üçüncü  uzunluğu girin
        //4
        //Lütfen dördüncü  uzunluğu girin
        //5
        //İki nokta Arasında mesafe :21.8

        //cevap : 8,764131445842194 olacak.


    }
}
