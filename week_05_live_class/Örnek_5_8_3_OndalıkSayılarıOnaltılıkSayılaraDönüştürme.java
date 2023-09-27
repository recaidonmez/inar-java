package week_05_live_class;

import java.util.Scanner;

public class Örnek_5_8_3_OndalıkSayılarıOnaltılıkSayılaraDönüştürme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir ondalık tam sayı girin: ");
        int ondalik = input.nextInt();

        // ondalık sayıyı on altılığa çevir

        String onaltılık = "";

        while (ondalik != 0) {
            int onaltılıkDeğer = ondalik % 16;

            // Ondalık değeri onaltılık basamağa dönüştürün
            char onaltılıkrakam = (onaltılıkDeğer <= 9 && onaltılıkDeğer >= 0) ?
                    (char) (onaltılıkDeğer + '0') : (char) (onaltılıkDeğer - 10 + 'A');

            onaltılık = onaltılıkrakam + onaltılık;
            ondalik = ondalik / 16;


        }

        System.out.println(" Onaltılık sayı  " + onaltılık);
    }
}       //
        //Bir ondalık tam sayı girin: 1234
// Onaltılık sayı  4D2