package week_3_live_class;

import java.util.Scanner;

public class piyango {

    public static void main(String[] args) {

        // Bir piyango numarası oluştur

        int piyango = 10 + (int) (Math.random() * 90);

        // Kullanıcıdan bir tahmin girmesini iste.

        Scanner input = new Scanner(System.in);
        System.out.println("Tahmininizi girin(Çift haneli)");
        int tahminirakam = input.nextInt();


        // Piyangodan rakamları al
        int piyangosayı1 = piyango / 10;
        int piyangosayı2 = piyango % 10;

        //
        int tahminirakam1 = tahminirakam / 10;
        int tahminirakam2 = tahminirakam % 10;

        System.out.println("Piyango numarası "
                + piyango);

        // Tahmini kontrol et
        if (tahminirakam == piyango) {
            System.out.println("Tam eşleşme 10.000 TL kazandınız");

        } else if (piyangosayı2 == tahminirakam1 &&
                   piyangosayı1 == tahminirakam2) {
            System.out.println("Rakamlar eşleşti al sana--> 3.000 TL) ");

        } else if (tahminirakam1 == piyangosayı1 ||
                    tahminirakam1 == piyangosayı2 ||
                    tahminirakam2 == piyangosayı1 ||
                    tahminirakam2 == piyangosayı2) {
                System.out.println("Bir rakam eşleşti al sana 1.000 TL.");
                } else{
            System.out.println("üzgünüm kaybetti.");

            //Tahmininizi girin(Çift haneli)
            //24
            //Piyango numarası 90
            //üzgünüm kaybetti.

            //23
            //Piyango numarası 27
            //Bir rakam eşleşti al sana 1.000 TL.

            //Tahmininizi girin(Çift haneli)
            //76
            //Piyango numarası 76
            //Tam eşleşme 10.000 TL kazandınız
        }

        }

        }

