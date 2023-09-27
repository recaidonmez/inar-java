package week_02_live_class;

import java.util.Scanner;

//Fahrenaytı santigrata çevirme
public class FahrenheitToCelsius {
    public static void main(String[] args) {

        //Veri almak için nesne oluştur
        Scanner input = new Scanner(System.in);

        //Ekrana veri talebi yazdırma nesnesi.
        System.out.println("Dereceyi fahrenayt olarak gir :");

        // Fahrenayt almak için nesne oluştur
        double fahrenayt = input.nextDouble();

        //Şimdi fahrenaytı santigırata çevir
        double santigrat = (5.0 / 9) * (fahrenayt - 32);

        //Hesaplama nesnesini oluştur.
    System.out.println(fahrenayt + " Fahrenayt " + santigrat + " Santigrat ");


        //girdi:100
        //çıktı:37,7777777778
    }
}
