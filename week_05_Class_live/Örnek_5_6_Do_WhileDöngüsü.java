package week_05_Class_live;

import java.util.Scanner;

public class Örnek_5_6_Do_WhileDöngüsü {
    public static void main(String[] args){

        int veri;
        int toplam = 0;

        Scanner input =new Scanner(System.in);

        // giriş 0 olana kadar veri gir.

        do { //sonraki veriyi oku

            System.out.println("veri girirşi 0 olana kadar veri gir");
            veri = input.nextInt();
            toplam += veri;

        }while(veri !=0);
        System.out.println("TOPLAM = "+ toplam);
        //veri girirşi 0 olana kadar veri gir
        //2
        //veri girirşi 0 olana kadar veri gir
        //3
        //veri girirşi 0 olana kadar veri gir
        //4
        //veri girirşi 0 olana kadar veri gir
        //0
        //TOPLAM = 9
    }
}
