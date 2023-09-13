package week_4_1_Assigmets;

import java.util.Scanner;

public class Question_04_04_AltıgeninAlanı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Altı genin kenar uzunluğunu girin: ");
        double kenarUzunlugu = input.nextDouble();

        final double PI = 3.14159265359;

        double s = 2 * kenarUzunlugu * (Math.sin(Math.PI / 6)); // s=apetem uzunluğu

        System.out.println("Altıgenin apotem uzunluğu: " + s);

        double alan = (6) * Math.pow(s, 2) / (4 * (Math.tan(Math.PI / 6)));


        double yuvarlanmışAlan = Math.round(alan * 100) / 100.0;

        System.out.println("Altıgenin alanı: " + yuvarlanmışAlan);

        //Altı genin kenar uzunluğunu girin:
        //5,5
        //Altıgenin apotem uzunluğu: 5.499999999999999
        //Altıgenin alanı: 78.59
    }
}
