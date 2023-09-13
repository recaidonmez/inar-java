package week_02.live_class;

import java.util.Scanner;
    // Para Bozdurma
public class ComputeChange {
    public static void main(String[] args){
        // Tarayıcı nesne oluştur.
        Scanner input = new Scanner(System.in);
        //Para iste.
        System.out.println("Lütfen para miktarını giriniz  : ");

        double miktar = input.nextDouble();

        int  kalanMiktar = (int) (miktar * 100);

        int liraSayısı = kalanMiktar / 100;

        kalanMiktar = kalanMiktar % 100;

        int çeyrekSayısı = kalanMiktar / 25;

        kalanMiktar = kalanMiktar % 25;

        int onKuruşSayısı = kalanMiktar / 10;

        int kalanMiktar1 = kalanMiktar % 10;

        int beşKuruşSayısı = kalanMiktar / 5;

        kalanMiktar = kalanMiktar % 5;

        int birKuruş   = kalanMiktar;

        System.out.println("Miktar" + miktar + " içerir" );
        System.out.println(liraSayısı + " Türk Lirası");
        System.out.println(çeyrekSayısı + " Çeyrek");
        System.out.println(onKuruşSayısı + " On kuruş");
        System.out.println(beşKuruşSayısı + " Beşkuruş sayısı");
        System.out.println(birKuruş + " BirKuruş Sayısı");


        //girdi:11,56
        //Çıktı:11---2--0---1---1
    }
}
