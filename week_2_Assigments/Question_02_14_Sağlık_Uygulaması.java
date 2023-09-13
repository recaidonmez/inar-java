package week_2_Assigments;

import java.util.Scanner;

public class Question_02_14_Sağlık_Uygulaması {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Agırlığı pound olarak isye.

        System.out.println("Lütfen ağırlığı pound olarak girin");
        double pound = input.nextDouble();

        //Boy uzunluğunu inch olarak iste.

        System.out.println("Lütfen boyunuzu inch  olarak girin");
        double inch = input.nextDouble();

        double kg = pound * 0.45359237;
        double metre = inch * 0.0254;

        System.out.println("BMI indeksiniz : " + kg / (Math.pow(metre,2)));

        //Lütfen ağırlığı pound olarak girin
        //95,5
        //Lütfen boyunuzu inch  olarak girin
        //50
        //BMI indeksiniz : 26.857257942215885


    }

}
