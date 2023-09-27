package week_02_live_class;

import java.util.Scanner;
    //Satış Vergisini hesaplama
public class SalesTax {
            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("Satın alma değerini gir");

                double satınAlmaDeğeri = input.nextDouble();

                double vergi = satınAlmaDeğeri * 0.06;

                System.out.println("Satıştan alınan vergi " +
                        (int) (vergi * 100) / 100.0);

                // girdi:197,55
                //çıktı :11,85
            }

}
