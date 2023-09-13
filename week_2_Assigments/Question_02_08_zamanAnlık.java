package week_2_Assigments;

import java.util.Scanner;

public class Question_02_08_zamanAnlık {

        public static void main (String[] args) {

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

            System.out.println("Zaman dilimi girin :" );
            int zamanDilimi = input.nextInt();

            System.out.println(" Anlık Zaman : " + (anlıksaat + zamanDilimi ) +" : " +
                    anlıkdakika + " : " + anlıksaniye + " GMT ");


            //Zaman dilimi girin :
            //-3
            //Anlık Zaman : 7 : 44 : 20 GMT

        }
}