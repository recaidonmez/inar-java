package week_3_live_class;

import java.util.Scanner;

public class ÇıkarmaSorusu {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        //Sınav için Rast gele iki tek haneli sayı oluştur.

        int sayı1 = (int)(Math.random() * 10);
        int sayı2 = (int)(Math.random() * 10);

        //sayıları çıkarma işlemine uygun hale getir.

        if(sayı1 < sayı2){
            int temp = sayı1;
            sayı1 = sayı2;
            sayı2 = temp;
        }

        //Soruyu sor

        System.out.println(sayı1 + " - " + sayı2 + "= ?");
        int cevap = input.nextInt();

        System.out.println( sayı1 + " - " +sayı2 + " = " + cevap + " ise "
                + (sayı1 - sayı2 == cevap));


    }
}
