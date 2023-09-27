package week_05_live_class;

public class Örnek_5_14_AsalSayı {
    public static void main(String[] args) {


        final int ASAL_SAYI_SAYISI = 50; // / Görüntülenecek asal sayı sayısı
        final int SATIR_BAŞI_sAYISI = 10; // / Satır başına 10 göster
        int sayaç = 0; // Asal sayıların sayısını say
        int NUMARA = 2; // Asallık açısından test edilecek bir sayı

        System.out.println("İlk 50 asal sayı\n");

        // Asal sayıları tekrar tekrar bulma
        while (sayaç < ASAL_SAYI_SAYISI) {
            // Asal sayıları tekrar tekrar bulma

            boolean ASALMI = true; //Şu anki sayı asal mı?

            //Sayının asal olup olmadığını test ediyoruz
            for (int BÖLEN = 2; BÖLEN <= NUMARA / 2; BÖLEN++) {
                if (NUMARA % BÖLEN == 0) { // / Doğruysa sayı asal değildi
                    ASALMI = false; // / asal değilse false olarak ayarlayın
                    break; // /for döngüsünden çık
                }
            }

            //// Asal sayıyı göster ve sayıyı arttı
            if (ASALMI) {
                sayaç++; // Increase the count

                if (sayaç % SATIR_BAŞI_sAYISI == 0) {
                    // Numarayı göster ve yeni satıra geç

                    System.out.println(NUMARA);
                } else {
                    System.out.print(NUMARA + " ");
                }
            }

            // Numarayı göster ve yeni satıra geç

            NUMARA++;
        }
    }
}


    //2 3 5 7 11 13 17 19 23 29
//31 37 41 43 47 53 59 61 67 71
//73 79 83 89 97 101 103 107 109 113
//127 131 137 139 149 151 157 163 167 173
//179 181 191 193 197 199 211 223 227 229