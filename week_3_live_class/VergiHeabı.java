package week_3_live_class;

import java.util.Scanner;

public class VergiHeabı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Medeni halini iste
        System.out.println(" Medeni halin Beker ise = 0 " +
                " Evli ayrı yaşayan dullar ise = 1" +
                 " Aile reisi = 3" +"  hiç biri");

        int medeniHali = input.nextInt();


          // yıllık geliri iste
        System.out.println("Yıllık Gelirinizi girin");
        double gelir = input.nextDouble();

        //Vergi Hesabını yap

        double vergi = 0;

        if (medeniHali == 0) {  // Bekarlar için gelir hesabı.
            if (gelir <= 8350)
                vergi = gelir * 0.10;
            else if (gelir <= 33950)
                vergi = 8350 * 0.10 + (gelir - 8350) * 0.15;
            else if (gelir <= 82250)
                vergi = 8350 * 0.10 + (33950 - 8350) * 0.15 + (gelir -
                        33950) * 0.25;
            else if (gelir <= 171550)
                vergi = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 -
                        33950) * 0.25 + (gelir - 82250) * 0.28;
            else if (gelir <= 372950)
                vergi = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 -
                        33950) * 0.25 + (171550 - 82250) * 0.28 + (gelir -
                        171550) * 0.33;
            else
                vergi = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 -
                        33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 -
                        171550) * 0.33 + (gelir - 372950) * 0.35;

        } else if (medeniHali == 1) {

        } else if (medeniHali == 2) {

        } else if (medeniHali == 3) {

        } else {

            System.out.println("Hata: geçersiz medeni hal");
            System.exit(1);
        }

        // Sonucu göster
        System.out.println("Vergin " + (int) (vergi * 100) / 100.0);
    }
}

