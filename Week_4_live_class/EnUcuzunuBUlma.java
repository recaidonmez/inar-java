package Week_4_live_class;

import java.util.Scanner;

public class EnUcuzunuBUlma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("üç tane lokasyon uzaklık girin :");

        int gym1l = input.nextInt();
        int gym2l = input.nextInt();
        int gym3l = input.nextInt();

        int gym1fiyat = 3;
        int gym2fiyat = 10;
        int gym3fiyat = 5;

        final double KmBP = 0.7;   //" kiolmetre başına para"

        int mesafegym1 = Math.abs(gym1l);
        int mesafegym2 = Math.abs(gym2l);
        int mesafegym3 = Math.abs(gym3l);

        double toplamMaliyet1 = (mesafegym1 * KmBP) * 2 + gym1fiyat;  // buradaki (2) git gel masrafı iki defa.
        double toplamMaliyet2 = (mesafegym2 * KmBP) * 2 + gym2fiyat;    //Klometre başına düşen yakıt parası
        double toplamMaliyet3 = (mesafegym3 * KmBP) * 2 + gym3fiyat;

        double tempUcuzYol = Math.min(toplamMaliyet1, toplamMaliyet2);
        double enUcuzYol = Math.min(tempUcuzYol, toplamMaliyet3);

        System.out.printf("Spor salonu maliyeti((%3d * %4.2fkmKmTL) *2 * %3d\t = %5.2f\n", gym1fiyat,KmBP, mesafegym1, toplamMaliyet1);
            //3d= Spor salonu maliyeti((  3 * $0,70)---> 3 rakamının yanına üç boşluk atar.
            //%4.2f   $0,70) *2 *  14--->  $0 dan sonrs iki rsksmı alır
        System.out.printf("Spor salonu maliyeti((%3d * %4.2fkmKmTL) *2 * %3d\t = %5.2f\n", gym2fiyat,KmBP, mesafegym2, toplamMaliyet2);
        System.out.printf("Spor salonu maliyeti((%3d * %4.2fkmKmTL) *2 * %3d\t = %5.2f\n", gym3fiyat,KmBP, mesafegym3, toplamMaliyet3);


        if (enUcuzYol == toplamMaliyet1) {
            System.out.printf("En ucuz spor salonu %d konumu %5.2f maliyet\n", gym1l, toplamMaliyet1);
        } else if (enUcuzYol == toplamMaliyet2) {
            System.out.printf("En ucuz spor salonu %d konumu %5.2f maliyet\n", gym2l, toplamMaliyet2);
        } else {
            System.out.printf("En ucuz spor salonu %d konumu %5.2f maliyet\n", gym3l, toplamMaliyet3);

            //üç tane lokasyon uzaklık girin :
            //-14
            //8
            //-9
            //Spor salonu maliyeti((  3 * $0,70km) *2 *  14	 = 22,60
            //Spor salonu maliyeti(( 10 * $0,70km) *2 *   8	 = 21,20
            //Spor salonu maliyeti((  5 * $0,70km) *2 *   9	 = 17,60
            //En ucuz spor salonu -9 konumu 17,60 maliyet
        }

    }
}










