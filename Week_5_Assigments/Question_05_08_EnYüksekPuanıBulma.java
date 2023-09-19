package Week_5_Assigments;

import java.util.Scanner;
    //(En yüksek puanı bulun) Kullanıcıdan öğrenci sayısını ve her öğrencinin adını ve
    //puanını girmesini isteyen ve sonunda en yüksek puana sahip öğrencinin adını görüntüleyen bir
    //program yazın.
public class Question_05_08_EnYüksekPuanıBulma {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int yüksekPuan = 0;            // En yükek ögrenci puanını tutar.
            String yüksekPuanİsmi = ""; // Yüksek puan alan öğrenci adını tutar

            // PKullanıcıdan öğrenci sayısını girmesini isteyin
            System.out.print("Öğrenci sayısı gir: ");
            int öğrencisayısı = input.nextInt();

            // Kullanıcıdan her öğrencinin adını ve puanını girmesini isteyin
            System.out.println("Öğrencinin adını ve puanını gir");

            for (int i = 0; i < öğrencisayısı; i++) {       //girilen öğrenci sayısına ulaşınca for dönğüsü kapanıyor alt if döngüsüne giriyor
                System.out.print("Öğrenci: " + (i + 1) + "\n   İsmi: ");//öğrenci sayısı bir artıyor ve ismini istiyor
                String isim = input.next();

                System.out.print("   Puanı: ");
                int puan = input.nextInt();

                // Puanın en yüksek puandan yüksek olup olmadığını test edin
                if (puan > yüksekPuan) { //eğer öğrencinin puanı yuksek puandan yuksek ise  yuksek puan puan oluyor
                    yüksekPuan = puan;
                    yüksekPuanİsmi = isim;
                }
            }
            // En yüksek puana sahip öğrencinin adını göster
            System.out.println("En yüksek puana sahip öğrenci: " + yüksekPuanİsmi);
        }
    }

        //
        //Öğrencinin asını ve numarasını gir
        //Öğrenci: 1
        //   İsmi: ali
        //   Puanı: 77
        //Öğrenci: 2
        //   İsmi: veli
        //   Puanı: 90
        //Öğrenci: 3
        //   İsmi: murat
        //   Puanı: 32
        //En yüksek puana sahip öğrenci: veli