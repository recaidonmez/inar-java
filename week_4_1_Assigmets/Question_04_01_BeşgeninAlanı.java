package week_4_1_Assigmets;

import java.util.Scanner;

import static java.lang.Math.floor;

public class Question_04_01_BeşgeninAlanı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Beşgenin kenar uzunluğunu girin: ");
        double kenarUzunlugu = input.nextDouble();

        final double PI = 3.14159265359;

        double s = 2 * kenarUzunlugu * ( Math.sin(Math.PI / 5));

        System.out.println("Beşgenin apotem uzunluğu: " + s);

        double alan = (5) * Math.pow(s,2) / (4 * (Math.tan(Math.PI / 5)));
        //double number = 3.7;
        //long roundedNumber = Math.round(number);
        //System.out.println("Yuvarlanmış Sayı: " + roundedNumber);

        //double number = 3.2;
        //double roundedUpNumber = Math.ceil(number);
        //System.out.println(
        //System
        //"Yukarı Yuvarlanmış Sayı: " + roundedUpNumber);

        //double number = 3.2;
        //double roundedUpNumber = Math.ceil(number);
        //System.out.println(
        //System
        //"Yukarı Yuvarlanmış Sayı: " + roundedUpNumber);

        double yuvarlanmışAlan = Math.round(alan * 100 ) / 100.0 ;

        System.out.println("Beşgenin alanı: " + yuvarlanmışAlan);

        //Beşgenin kenar uzunluğunu girin: 5,5
        //Beşgenin apotem uzunluğu: 6.465637775217204
        //Beşgenin alanı: 71.92
}
}
