package week_05_Class_live;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Örnek_5_7_EnBüyükOrtakBöleniBulmajk {
    public static void main(String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.println("İlk Numarayı gir");
        int num1 = input.nextInt();

        System.out.println("\nikinci numarayı gir");
        int num2 = input.nextInt();

        int gcd = 1;    // gcd= Ortak bölen
        int olasıGcd = 2;

        while (olasıGcd <= num1  && olasıGcd <= num2) {

            if (num1 % olasıGcd == 0 && num2 % olasıGcd == 0) {
                gcd = olasıGcd;
            }
            olasıGcd++;

        }
        System.out.println("En büyük ortak böleni =>" + num1 + " ile " + num2 + " in " + gcd + " dir");


    }

     //İlk Numarayı gir
    //25
    //
    //ikinci numarayı gir
    //2525
    //En büyük ortak böleni =>25 ile 2525 in 25 dir
    }

