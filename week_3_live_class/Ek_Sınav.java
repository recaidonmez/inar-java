package week_3_live_class;

import java.util.Scanner;

public class Ek_Sınav {

    public static void main(String[] args) {

        // Sistemden rast gele 1 ile 7 arasında sayı almasısnı istiyoruz.
        int sayı1 = (int) (System.currentTimeMillis() % 10);
        int sayı2 = (int) (System.currentTimeMillis() / 7 % 10);

        //Veri girilmesini istiyoruz. Ve Soruyu soruyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("Rakamlar toplamı " + sayı1 + " + " + sayı2 + "  : ? ");
        int cevap = input.nextInt();

        //Çıktı true yada false(<>= işaretleri bu cevabı aldırıyor)
        System.out.println(sayı1 + " + " + sayı2 + " = " + cevap + " is " +
                        (sayı1 + sayı2 == cevap));
    }
}