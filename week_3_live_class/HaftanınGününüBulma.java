package week_3_live_class;

import java.util.Scanner;

public class HaftanınGününüBulma {
    public static void main(String[] args ){

        Scanner input =  new Scanner(System.in);

        System.out.println("Gün girin (1-7 Arası)");

        int gün = input.nextInt();

        switch (gün) {

            case 1:
            case 2:
            case 3:System.out.println("Hafta içi"  + "Çarşamba) "); break;
            case 4:
            case 5: System.out.println("Hafta içi" ); break;
            case 6:
            case 7:System.out.println("Hafta sonu "); break;


            //Gün girin (1-7 Arası)
            //6
            //Hafta sonu


        }
    }
}
