package week_02_live_class;

import java.util.Scanner;
        //faiz oranını gösterme
public class ComputeLoan {

    public static void main(String[] args) {
        // Bir Tarayıcı oluştur.
        Scanner input = new Scanner(System.in);


        System.out.print("Yıllık faiz oranını yüzde olarak giriniz örn: 7.25%: ");
        // Yıllıkfaiz oranını yüzde olarak giriniz örn: 7.25%
        //nesne ayarla
        double yıllıkFaizOranı = input.nextDouble();

        // Aylık faiz oranını elde et.
        double aylıkFaizOranı = yıllıkFaizOranı / 1200;

        // Yık sayısını gir
        System.out.print("Yıl sayısını gir örnek: 5 gibi : ");
        //Nesne.
        int yılSayısı = input.nextInt();

        // Kredi tutarırnı gir.
        System.out.print("Kredi tutarı gir örnek: 120000.95: ");
        double krediTutarı = input.nextDouble();

        // Ödemeyi Hesapla
        double aylıkÖdeme  = krediTutarı * aylıkFaizOranı / (1 - 1 /
                Math.pow(1 + aylıkFaizOranı, yılSayısı  * 12));

        double toplamÖdeme = aylıkÖdeme * yılSayısı * 12;

        // Sonuçları Göster
        System.out.println("Aylık ödeme "  + (int) (aylıkÖdeme
                * 100) / 100.0 + "TL");
        System.out.println(" Toplam Ödeme " + (int) (toplamÖdeme *
                100) / (double) 100 + "TL");
        //girdi:5,75--15--250000
        //çıktı:2076,02--373684,53

    }
}