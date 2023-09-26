package Week_6_Assigmets;

import java.util.Scanner;

public class Question_06_22_karekökünYaklaşıkDeğeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayı girin");
        int sayı = input.nextInt();

        System.out.println( + sayı + "  Saynın yaklaşık karekökü şöyledir: " +(int) karekök(sayı)); // int olduğu zaman , virğülden sonrasını yazmaz
    }

    public static double karekök(double sayı) {
        double öncekiTahmin = 1;
        double sonrakiTahmin =(öncekiTahmin + sayı / öncekiTahmin) / 2;
        //Döngünün kaç defa döneceğini bilmediğim için  WHİLE kullandım
        while(sonrakiTahmin -öncekiTahmin >0.0001) {
            öncekiTahmin = sonrakiTahmin;
            sonrakiTahmin = (öncekiTahmin + sayı / öncekiTahmin) / 2;


        }
        öncekiTahmin = sonrakiTahmin;
        sonrakiTahmin = (öncekiTahmin + sayı / öncekiTahmin) / 2;
        return sonrakiTahmin;

    }

}
//Sayı girin
//34
//34  Saynın yaklaşık karekökü şöyledir: 6