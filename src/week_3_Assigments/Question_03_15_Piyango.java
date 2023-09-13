package week_3_Assigments;

import java.util.Scanner;

public class Question_03_15_Piyango {
    public static void main(String[] args) {


        // Kullanıcıdan bir tahmin iteyin
        Scanner input = new Scanner(System.in);

        // Bir piyango numarası oluşturun
        int piyango = 100 + (int) (Math.random() * 900);

        System.out.print("Çekiliş için 3 basamaklı bir sayı girin): ");
        int tahmin = input.nextInt();



        // Piyango numarasındaki rakamları ayır
        int pnumara1 = piyango / 100;
        int pnumara2 = (piyango / 10) % 10;
        int pnumara3 = piyango % 10;

        // Tahmin rakamlaırını ayır
        int tnumara1 = tahmin / 100;
        int tnumara2 = (tahmin / 10) % 10;
        int tnumara3 = tahmin % 10;

        System.out.println("Pİyangonun numarası " + piyango);

        // tahminle piyangoyu karşılaştır.
        if (tahmin == piyango) {
            System.out.println("Kazandın $10,000");

        } else if (tnumara1 == pnumara2 && tnumara2 == pnumara1 && tnumara3 == pnumara3 ||
                tnumara1 == pnumara3 && tnumara3 == pnumara1 && tnumara2 == pnumara2 ||
                tnumara2 == pnumara3 && tnumara3 == pnumara2 && tnumara1 == pnumara1) {

            System.out.println("Tüm sayılar eşleşti!!! 3,000$ ödül!!!");

        } else if (tnumara1 == pnumara1
                || tnumara1 == pnumara2
                || tnumara1 == pnumara3)

            System.out.println("Bir numara eşleşti!!! 1,000$ ödül!!!");

        else


            System.out.println("Üzgünüm kazanamadın :( ");

    }
}
    //Çekiliş için 3 basamaklı bir sayı girin): 546
//Pİyangonun numarası 643
//Üzgünüm kazanamadın :



