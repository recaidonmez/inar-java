package week_05_Class_live;

import java.util.Scanner;

public class Örnek_5_3_ArkaArkayaÇıkartmaSorusu {
    public static void main(String[] args) {

        final int sorulacakSoruSayısı = 5; //kaç adet soru sorulacak
        int doğruCevapSayısı = 0;
        int sayaç = 0;  //Sorulan soruları sayar.
        long başlamaZamanı = System.currentTimeMillis();
        String çıktı = "";//Çıktı dizini başta boştur.
        Scanner input = new Scanner(System.in);

        while (sayaç < sorulacakSoruSayısı) {
            //iki tane tek haneli tam sayı üret
            int sayı1 = (int) (Math.random() * 10);
            int sayı2 = (int) (Math.random() * 10);

            //Her zaman küçüğü büyükten çıkar
            if (sayı1 < sayı2) {
                int temp = sayı1;
                sayı1 = sayı2;
                sayı2 = temp;
            }
            System.out.println(sayı1 + "-" + sayı2 + "  =  ?");
            int cevap = input.nextInt();

            if (sayı1 - sayı2 == cevap) {
                System.out.println("Bildin   !!!\n");
                doğruCevapSayısı++;

            } else
                System.out.println("Cevabın Yanlış. Doğrucevap = " + sayı1 + "-" + sayı2 + " = " + (sayı1 - sayı2) + " olmalıdır.\n");

            //soru sayısını arttır.
            sayaç++;
            çıktı += "\n" + sayı1 + "-" + sayı2 + "=" + cevap +
                    ((sayı1 - sayı2 == cevap) ? " doğru" : " yanlış");
        }
        //sınav ne kadar süre sürdü.
        long bitişZamanı = System.currentTimeMillis();
        long sınavZamanı = bitişZamanı - başlamaZamanı;

        System.out.println("Doğru cevap sayısı=" + doğruCevapSayısı + "\nSınav Zamanı = " + (sınavZamanı / 1000) + " dakika" + çıktı);
    }
}

        ///9-3  =  ?
//6
//Bildin   !!!
//
//7-0  =  ?
//7
//Bildin   !!!
//
//8-2  =  ?
//6
//Bildin   !!!
//
//0-0  =  ?
//1
//Cevabın Yanlış. Doğrucevap = 0-0 = 0 olmalıdır.
//
//4-2  =  ?
//2
//Bildin   !!!
//
//Doğru cevap sayısı=4
//Sınav Zamanı = 13 dakika
//9-3=6 doğru
//7-0=7 doğru
//8-2=6 doğru
//0-0=1 yanlış
//4-2=2 doğru

