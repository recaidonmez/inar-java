package week_02.live_class;

import java.util.Scanner;

//Güncel Saati görüntüleme.
public class ShowCurrentTime {

    public static void main(String[] args) {

        //Veri alma nesnesini oluştur
        Scanner input = new Scanner(System.in);

        //Bilgisayardan güncel milisaniyeyi al.
        long toplammilisaniye = System.currentTimeMillis();

        long toplamsaniye = toplammilisaniye / 1000;

        long anlıksaniye = toplamsaniye % 60;

        long toplamdakika = toplamsaniye / 60;

        long anlıkdakika = toplamdakika % 60;

        long toplamsaat = toplamdakika / 60;

        long anlıksaat = toplamsaat  % 24;

        //Sonuçları Gösteren nesne oluştur.

        System.out.println(" Anlık Zaman : " + (anlıksaat + 3) +" : " +
                anlıkdakika + " : " + anlıksaniye + " GMT ");




    }
}
