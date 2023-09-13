package week_02.live_class;

import java.util.Scanner;

// Zamanı gösterme
public class DisplayTime {

    public static void main(String[] args ) {

        // Bir Veri İsteme nesnesi.
        Scanner input = new Scanner(System.in);

        //Veri isteme nesnesi.
        System.out.println("Lütfen  saniye girin");

        //İstenenen rakamın girileceği nesne.
        int saniye = input.nextInt();

        //saniyeleiri dakika cinsinden bul.

        int dakika = saniye / 60;

            //Kalan Saniyeyi bulmaj,k için modunu alacagiz
        int kalanSaniye = saniye % 60;

        //girirlen saniye kaç dakika  kaç saniye  ve kalan saniye
        //  hesap nesnesi.

        System.out.println(saniye +" Saniye " + dakika + " Dakika " +
                kalanSaniye + " Saniye " );


        //girdi 500
        //çıktı: 8dkikd 20 saniye

    }
}
