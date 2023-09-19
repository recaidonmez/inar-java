package Week_5_Assigments;

import java.util.Scanner;

public class Question_05_01_PozitifveNegatifSayılarıSayınveSayılarınOrtalamasınıHesaplayın {
    //(Pozitif ve negatif sayıları sayın ve sayıların ortalamasını hesaplayın) Belirtilmemiş sayıda
    //tamsayı okuyan, kaç pozitif ve negatif değerin okunduğunu belirleyen ve giriş değerlerinin toplamını
    //ve ortalamasını hesaplayan (saymadan) bir program yazınız. sıfırlar). Programınız 0 girişiyle
    //sona erer. Ortalamayı "değişen nokta sayısı" olarak görüntüleyin. İşte örnek bir çalışma:
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pozitif = 0;    // Pozitif sayıları say
        int negatif = 0;    // Negatif sayıları sayan sayaç
        int say     = 0;    // Tüm sayıları say
        double toplam = 0;   // Hepsinin toplamını topla

        // kullanıcıdan tam sayıları iste veen son 0 girsin
        System.out.print("Bir takım tamsayı gir. 0 da sona ersin: ");
        int numara = input.nextInt();

        if (numara == 0) {    // Koruyucu bir degeri test
            System.out.println("0 ın dışında bir sayı girilmedi: ");
            System.exit(1);
        }

        while (numara != 0) {// Sentınel(kotuyucu) degeri test et.
            if (numara > 0)
                pozitif++;    // Pozitifleri arttır.
            else
                negatif++;    // Negatifleri arttır.
            toplam += numara;    // Bütün sayıların toplamı
            say++;                // Increase the count

            numara = input.nextInt();
        }

        // Ortalamayı hesapla
        double ortalama = toplam / say;

        // Sonuçları göster
        System.out.println(
                "POzitif sasyılar toplma " + pozitif +
                        "\nNegatiflerin Sayısı " + negatif +
                        "\nBütün hepsinin toplamı " + toplam +
                        "\nOrtalama " + ortalama);
    }
}
            //Bir takım tamsayı gir. 0 da sona ersin: 1
//2
//-1
//3
//0
//POzitif sasyılar toplma 3
//Negatiflerin Sayısı 1
//Bütün hepsinin toplamı 5.0
//Ortalama 1.25