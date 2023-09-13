package Week_4_live_class;

import java.util.Scanner;

public class Alıştırma_4_5_PiyangoNumarasıRevizeEtme {

        public static void main(String[] args) {

            // İki basamaklı bir dize olarak bir piyango oluşturun
            String piyango = "" + (int) (Math.random() * 10)
                    + (int) (Math.random() * 10);

            // Kullanıcıdan bir tahmin girmesi isteniyor
            Scanner input = new Scanner(System.in);
            System.out.print("\" Piyango tahmininizi girin (iki rakam) ");
            String guess = input.nextLine();

            // Piyangodan rakamları al

            char piyangosayısı1 = piyango.charAt(0);

            char piyangosayısı2 = piyango.charAt(1);

            // Tahminden rakamları al
            char tahminrakam1 = guess.charAt(0);
            char tahminrakam2 = guess.charAt(1);
            System.out.println("\"Piyango numarası " + piyango);

            // Check the guess
            if (guess.equals(piyango))
                System.out.println("Tam eşleşme: 10.000 $ kazandınız");
            else if (tahminrakam2 == piyangosayısı1
                    && tahminrakam1 == piyangosayısı2)
                System.out.println("\"Tüm rakamları eşleştirin: 3.000 $ kazandınız");
            else if (tahminrakam1 == piyangosayısı1
                    || tahminrakam1 == piyangosayısı2
                    || tahminrakam2 == piyangosayısı1
                    || tahminrakam2 == piyangosayısı2)
                System.out.println("\"Bir rakamı eşleştirin: 1.000 $ kazandınız");
            else
                System.out.println("Üzgünüz, eşleşme yok");
        }
    }

