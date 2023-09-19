package Week_5_Assigments;

import java.util.Scanner;
        //(En yüksek iki puanı bulun) Kullanıcıdan öğrenci sayısını ve her öğrencinin adını ve puanını
        //girmesini isteyen ve son olarak en yüksek puana sahip öğrenciyi ve ikinci en yüksek puana sahip
        //öğrenciyi görüntüleyen bir program yazın.
public class Question_05_09_Enyüksekikipuanıbulun {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            //  Kullanıcıdan öğrenci sayısını girmesini isteyin
            System.out.print("Öğrenci sayısını giriniz: ");
            int öğrenciSayısı = input.nextInt();

            int puan,                       // öğrencilerin puanını tutar
                    yüksek = 0,             // en yuksek puan
                    ikinciYüksek = 0;        // ikinci en yuksek puan
            String isim = "",                // Öğrencinin adını tutar
                    öğrenci1 = "",           // en yuksek puan alan
                    öğrenci2 = "";           // ikinci en yuksek alan

            // Kullanıcıdan her öğrencinin adını ve puanını girmesini isteyin
            System.out.println("Her öğrencinin adını ve puanını girin:");

            for (int i = 0; i < öğrenciSayısı; i++) {
                System.out.print("Öğrenci: " + (i + 1) + "\n   ismi: ");
                isim = input.next();
                System.out.print("   puan: ");
                puan = input.nextInt();

                if (i == 0) {
                    //  İlk öğrenciyi şu ana kadar en yüksek puanı alan öğrenci yap
                    yüksek = puan;
                    öğrenci1 = isim;

                } else if (i == 1 && puan > yüksek) {
                    // Girilen ikinci öğrencinin puanı
                    // ilk öğrenciden daha yüksek
                    ikinciYüksek = yüksek;
                    yüksek = puan;
                    öğrenci2 = öğrenci1;
                    öğrenci1 = isim;
                } else if (i == 1) {
                    // Second student entered scored
                    // lower than first student
                    ikinciYüksek = puan;
                    öğrenci2 = isim;
                } else if (i > 1 && puan > yüksek && puan > ikinciYüksek) {
                    //  Son giren öğrenci en yüksek puanı alır
                    ikinciYüksek = yüksek;
                    öğrenci2 = öğrenci1;
                    yüksek = puan;
                    öğrenci1 = isim;
                } else if (i > 1 && puan > ikinciYüksek) {
                    // Son giren öğrenci ikinci en yüksek puanı alır
                    öğrenci2 = isim;
                    ikinciYüksek = puan;
                }
            }

            //  En yüksek puanı alan öğrenciyi göster
            // a ve ikinci en yüksek puanı alan öğrenci
            System.out.println(
                    "En yüksek puanı alan öğrenci: " + öğrenci1 +
                            "\nEn yüksek puanı alan ikinci öğrenci: " + öğrenci2);
        }
    }

                //
                //Öğrenci sayısını giriniz: 3
                //Her öğrencinin adını ve puanını girin:
                //Öğrenci: 1
                //   ismi: bahar
                //   puan: 23
                //Öğrenci: 2
                //   ismi: betül
                //   puan: 45
                //Öğrenci: 3
                //   ismi: ali
                //   puan: 90
                //En yüksek puanı alan öğrenci: ali
                //T En yüksek puanı alan ikinci öğrenci: betül