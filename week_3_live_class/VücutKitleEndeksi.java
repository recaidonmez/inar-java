package week_3_live_class;

import java.util.Scanner;

public class VücutKitleEndeksi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ağırlığınızı pound cinsinden girin");
        double pound = input.nextDouble();

        System.out.println("Boyunuzu inch cinsinden girin");
        double inch = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // Devamlı
        final double METERS_PER_INCH = 0.0254; // Devamlı

        double kilogram = pound * KILOGRAMS_PER_POUND;
        double metre = inch * METERS_PER_INCH;

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
    }
}



