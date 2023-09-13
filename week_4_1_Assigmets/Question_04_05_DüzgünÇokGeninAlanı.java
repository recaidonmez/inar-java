package week_4_1_Assigmets;

import java.util.Scanner;

public class Question_04_05_DüzgünÇokGeninAlanı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Çokgenin kenar sayısını girin: ");
        double kenarSayısı= input.nextDouble();

        System.out.println("Çokgen için bir kenar uzunluğunu girin: ");
        double kenarUzunluğu = input.nextDouble();

        double n = kenarSayısı;
        double x =kenarUzunluğu;

        final double PI = 3.14159265359;

        double s = 2  * x * ( Math.sin(Math.PI / n));  // apotem = s / (2 * tan(π/n))

        System.out.println("Düzgün çokgenin apotem uzunluğu: " + s);

        double alan = n * x * Math.pow(s,2) / 4 *  x * (Math.tan(Math.PI / n));     //çokgenin alanı.


        double yuvarlanmışAlan = Math.round(alan * 100 ) / 100.0 ;

        System.out.println("Çokgenin alanı: " + yuvarlanmışAlan);

        //Beşgenin kenar uzunluğunu girin: 5,5
        //Beşgenin apotem uzunluğu: 6.465637775217204
        //Beşgenin alanı: 71.92
    }
}


