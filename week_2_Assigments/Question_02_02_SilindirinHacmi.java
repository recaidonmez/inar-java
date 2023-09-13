package week_2_Assigments;

import java.util.Scanner;
        // Silindirin Hacmimini Hedapla
public class Question_02_02_SilindirinHacmi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Silindirin Yarıçap değerini iste.
        System.out.println("Yarı çapı gir: ");
        double yarıÇap = input.nextDouble();

        // Silindirin uzunluk değerini iste.

        System.out.println("Uzunluk  gir: ");
        //uzunluğu hesapla
        double uzunluk = input.nextDouble();

        final double Pİ = 3.14159;
        // alanı hesapla
        double alan = yarıÇap * yarıÇap * Pİ;

        double hacim = alan * uzunluk;



        System.out.println("Silindirin Uzunluğu :" +  hacim );

        System.out.println("Silindirin hacmi  :" + alan +(int) uzunluk);

        //girdi:5,5 -- 12
        //çıktı95,0331---1140,4
    }
}
