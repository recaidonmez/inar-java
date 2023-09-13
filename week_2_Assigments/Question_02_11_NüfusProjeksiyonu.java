package week_2_Assigments;

import java.util.Scanner;

public class Question_02_11_NüfusProjeksiyonu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("yıl Sayısısnı gir");

        long mevcutNüfus = 312032486;
        long yıl  = input.nextLong();

        long saniye = yıl * 365 * 24 * 60 * 60;

        long doğum = saniye / 7;

        long ölüm = saniye / 13;

        long iltica = saniye / 45;



        System.out.println(yıl + " yılda nüfus sayısı "  +
                (mevcutNüfus + doğum - ölüm + iltica) +" olur ");

        //yıl Sayısısnı gir
        //5
        //5 yılda nüfus sayısı 325932970 olur
    }
}