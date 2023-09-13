package week_2_Assigments;

import java.util.Scanner;

public class Question_02_06_TamsayısakiBasamaklarToplamı {
    public static void main(String[] args){

        //Tamsayı iste
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen en fazla üç basamaklı " +
                "bir tam sayı giriniz");
        int tamSayı = input.nextInt();
        // sayının önce yüzler basamağı değeri
        int yüzler = tamSayı / 100 ;

        //Sonra kalan onlar basamağı modla alınır.
        int kalanonlar =  tamSayı % 100;

        // onlar basamağı 10 a bölünüp onlar bulunur
        int onlar = kalanonlar /10;

        int birler = tamSayı % 10;

        System.out.println("Rakamlar Toplamı");
        System.out.println(yüzler + onlar + birler);

        //girdi:999 sonuç: 27
    }
}
