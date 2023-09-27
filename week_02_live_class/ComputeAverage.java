package week_02_live_class;

import java.util.Scanner;


    // Ortalama alma
public class ComputeAverage {
    public static void main(String[] args) {
        // Önce bir veri olma nesnesi oluştur.
        Scanner input = new Scanner(System.in);

        // Bir numara girlmesini iste
        System.out.println(" Numara Giriniz : ");

        //Nesne1 satırır
        int numara1 = input.nextInt();

        //Numara Girmesini iste
        System.out.println(" Enter second number : ");

        // Nesne2
        int numara2 = input.nextInt();

        // Numara girmesini iste
        System.out.println(" Enter three number : ");

        //Nesne3
        int numara3 = input.nextInt();

        double ortalama = (numara1 + numara2 + numara3) / 3;

        System.out.println("Merhaba " +" Numara1 " + " Numara2 " +
                " Numara3 " + " rakamların ortalaması " + ortalama);


    }      // girdi 1-2 -3 çıktı 2,0
}
