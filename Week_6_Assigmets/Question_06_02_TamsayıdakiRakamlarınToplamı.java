package Week_6_Assigmets;

import java.util.Scanner;

public class Question_06_02_TamsayıdakiRakamlarınToplamı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı gir --> ");
        long sayı = input.nextLong(); // kullanıcı nekadar bir rakam girecaği beli değil.

        long toplam = rakamlarToplamınıGöster(sayı);

        System.out.println(sayı + "   Sayısının rakamlar tolamı  -->   " + toplam);

    }

    public static long rakamlarToplamınıGöster(long s) {
        long toplam = 0; //önce bir değer atanır

        while (s != 0) {//sayının  modunu alarak  rakamlara ayır yani =0 olmayana kadar

            int rakam = (int) (s % 10);

            toplam += rakam;

            s /= 10;

        }
        return toplam;

    }
    //Bir sayı gir -->
    //234
    //234   Sayısının rakamlar tolamı  -->   9

}
    //Bir sayı gir -->
    //587657
    //587657   Sayısının rakamlar tolamı  -->   38