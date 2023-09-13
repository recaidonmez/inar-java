package week_3_Assigments;

import java.util.Scanner;

public class Question_03_06_VücutKitle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ağırlığınızı pound cinsinden girin");
        double pound = input.nextDouble();

        System.out.println("Boyunuzu fith cinsinden girin");
        double fith = input.nextDouble();

        System.out.println("Boyunuzu inch cinsinden girin");
        double inch = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Devamlı
        final double METERS_PER_INCH = 0.0254; // Devamlı

        double kilogram = pound * KILOGRAMS_PER_POUND;
        double metre =((fith * 12 ) + inch ) * METERS_PER_INCH;

        // BMI HESAPLA
        double bmi = kilogram / (metre * metre);

        //Sonuçları göster
        System.out.println("BMİ ise " + bmi );
        if (bmi < 18.5)
            System.out.println("Çok Zayıf");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Şişko");
        else
            System.out.println("Obez");

        //Ağırlığınızı pound cinsinden girin
        //140
        //Boyunuzu fith cinsinden girin
        //5
        //Boyunuzu inch cinsinden girin
        //10
        //BMİ ise 20.087702275404553
        //Normal
    }
}

