package week_3_Assigments;

import java.util.Scanner;

public class Question_03_07_Para_Dönüştürme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Para miktarını TL Cinsinden girin (örnek 11,56): ");
        double miktar = input.nextDouble();

        int kalanMiktar = (int) (miktar * 100);

        int tlSayısı = kalanMiktar / 100;
        kalanMiktar %= 100;
        int yirmibeşkuruşSayısı = kalanMiktar / 25;
        kalanMiktar %= 25;

        int onKururşSayısı = kalanMiktar / 10;
        kalanMiktar %= 10;

        int beşKuruş = kalanMiktar / 5;
        kalanMiktar %= 5;

        int paraSayısı = kalanMiktar;

        System.out.println("Senin miktarın " + miktar + " şunlardan oluşur.");

        if (tlSayısı <= 1) {
            System.out.println(tlSayısı + " tl");
        } else {
            System.out.println(tlSayısı + " tller");
        }
        if (yirmibeşkuruşSayısı <= 1) {
            System.out.println(yirmibeşkuruşSayısı + " yirmibeşkuruş");
        } else {
            System.out.println(yirmibeşkuruşSayısı + " yirmibeşkuruşlar");
        }
        if (onKururşSayısı <= 1) {
            System.out.println(onKururşSayısı + " onkuruş");
        } else {
            System.out.println(onKururşSayısı + " onkuruşlar");
        }
        if (beşKuruş <= 1) {
            System.out.println(beşKuruş + " beşkuruş");
        } else {
            System.out.println(beşKuruş + " beşkururlar");
        }
        if (paraSayısı <= 1) {
            System.out.println(paraSayısı + " kuruşdan oluşur.");
        } else {
            System.out.println(paraSayısı + " kuruşlardan oluşur");

        }
    }
    }

    //Senin miktarın 12.41 şunlardan oluşur.
//12 tller
//1 yirmibeşkuruş
//1 onkuruş
//1 beşkuruş
//1 kuruşdan oluşur.
