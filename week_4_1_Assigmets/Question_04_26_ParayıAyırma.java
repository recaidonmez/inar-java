package week_4_1_Assigmets;

import java.util.Scanner;

public class Question_04_26_ParayıAyırma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Para miktarını TL Cinsinden girin (örnek 11,56): ");

        String miktar = input.next();

        int comma =miktar.indexOf(',');

        int tlSayısı =Integer.parseInt(miktar.substring(0, comma));
        int kalanMiktar =Integer.parseInt(miktar.substring(comma + 1));

        kalanMiktar = kalanMiktar % 100;

        int çeyrekSayısı = kalanMiktar / 25;

        kalanMiktar = kalanMiktar % 25;

        int onKuruşSayısı = kalanMiktar / 10;

        int kalanMiktar1 = kalanMiktar % 10;

        int beşKuruşSayısı = kalanMiktar / 5;

        kalanMiktar = kalanMiktar % 5;

        int birKuruş   = kalanMiktar;

        System.out.println("Miktar " + miktar + " içerir" );
        System.out.println(tlSayısı + " Türk Lirası");
        System.out.println(çeyrekSayısı + " Çeyrek");
        System.out.println(onKuruşSayısı + " On kuruş");
        System.out.println(beşKuruşSayısı + " Beşkuruş sayısı");
        System.out.println(birKuruş + " BirKuruş Sayısı");
    }
}

