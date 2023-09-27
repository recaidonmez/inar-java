package week_05_live_class;

import java.util.Scanner;

public class Örnek_5_5_birtamsayısayısınınToplamınıokuyanHesaplayan {

    /** Main yöntem   */
    public static void main(String[] ars) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir tam veri girin, 0 da bitsin.");

        int veri = input.nextInt();

        //Giriş sıfır olana kadar verileri okumaya devam et.

        int toplam = 0;

        while(veri!=0){
            toplam += veri;
            //Sonraki verileri oku
            System.out.println("bir tam veri girin en son 0 da bitsin");
             veri = input.nextInt();
        }
             System.out.println("Tolam  = " + toplam);

        }

            //Bir tam veri girin, 0 da bitsin.
        //2
        //bir tam veri girin en don 0 da bitsin
        //3
        //Tolam  = 2
        //bir tam veri girin en don 0 da bitsin
        //4
        //Tolam  = 5
        //bir tam veri girin en don 0 da bitsin
        //0
        //Tolam  = 9





    }

