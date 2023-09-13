package week_3_Assigments;

import java.util.Scanner;

public class Question_03_20_RüzgarSoğutmaSıcaklığı {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("-58F ile 41F arasındaki sıcaklığı Fahrenheit cinsinden girin:");
    double sıcaklık = input.nextDouble();

    System.out.println("Rüzgar hızını (>=2) mil/saat cinsinden girin :");
    double hız = input.nextDouble();

    if (sıcaklık <= -58 || sıcaklık > 41 || hız < 2) {
        System.out.print("The ");
        if (sıcaklık <= -58 || sıcaklık > 41) {
            System.out.print("sıcaklık ");
        }
        if ((sıcaklık <= -58 || sıcaklık > 41) && hız < 2) {
            System.out.print("ve ");
        }
        if (hız < 2)
            System.out.print("rüzgar hız ");

        System.out.println("hata");
        System.exit(1);

    }

    double rüzgarIsısı = 35.74 + 0.6215 * sıcaklık - 35.75 * Math.pow(hız, 0.16)
            + 0.4275 * sıcaklık * Math.pow(hız, 0.16);
    System.out.println("Rüzgarın soğuğu indeksi: " + rüzgarIsısı);

    //-58F ile 41F arasındaki sıcaklığı Fahrenheit cinsinden girin:
        //32
        //Rüzgar hızını (>=2) mil/saat cinsinden girin :
        //4
        //Rüzgarın soğuğu indeksi: 28.077344785741428


}       //60
    //Rüzgar hızını (>=2) mil/saat cinsinden girin :
       //5
   // hata sıcaklık .
}

