package week_2_Assigments;

import java.util.Scanner;

public class Question_02_17_Sıcaklık_ölcümü {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("-58 ile + 41 arasında bir Fahrenayt derecesi girin:  ");
        // ft = fahrenayt demek
        double t = input.nextDouble();

        System.out.println("2 yada  ikiden büyük rüzgar hızı girin:  ");
        //v= hız demek
        double v = input.nextDouble();

        double sıcaklık = 35.74 + (0.6215 * t) - 35.75 * ( Math.pow(v,0.16 ) +
                (0.4275 * t) * (Math.pow(v,0.16)));

        System.out.println(" Sıcaklık  :" +  sıcaklık);
                //Belirtilen karşılıkları adım adım çözebiliriz:
        // 𝑤𝑐 = 35.74 + 0.6215𝑡 - 35.75𝑣 / 0.16 + 0.4275𝑡𝑎 / 𝑣^0.16
        // Burada: - 𝑤𝑐: Rüzgar Hızı - 𝑡: Sıcaklık (°C) - 𝑎: Nem (%) - 𝑣: Hız (km/saat)
        // Denkleminizi iki ana noktaya ayırabiliriz:
        // 1. `35.74 + 0.6215𝑡 - 35.75𝑣 / 0.16` 2
    }
}
