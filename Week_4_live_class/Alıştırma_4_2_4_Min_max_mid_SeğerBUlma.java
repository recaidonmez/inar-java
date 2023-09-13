package Week_4_live_class;

import java.util.Scanner;

public class Alıştırma_4_2_4_Min_max_mid_SeğerBUlma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min, mid, max;
        //Önce üç rakamlı

        int numara1 = -46;
        int numara2 = 125;
        int numara3 = -5;

        //MAX DEĞERİ BULMA.
        int tempMax = Math.max(numara1, numara2);
        max = Math.max(tempMax, numara3);

        //MİN DEĞERİ BULMA
        int tempMin = Math.min(numara1, numara2);
        min = Math.min(tempMin, numara3);

        //ORTANCA DEĞERİ BULMA.

        if (numara1 != max && numara1 != min){
            mid = numara1;

        }else if (numara2 != max && numara2 != min){
            mid = numara2;
        }else{
            mid = numara3;
        }

        System.out.printf(" Numaralarlar  %d, %d, %d\n", numara1, numara2, numara3);
        System.out.printf(" Numaralar arasında büyük olan değer %d\n", max); //MAX deger.
        System.out.printf(" Numaralar arasında küçük olan değer %d\n", min); //MİN değer.
        System.out.printf(" Ortanca değer " +mid);// MİD değeri




            System.out.println("                                               ");
            System.out.println(" ---------------------------------------------");

            //Sonra 2 rakamlı

            int a = 5;
            int b = 12;

            int c = Math.max(a, b);
            int d = Math.min(a, b);


            System.out.printf(" Numaraların büyüğü  %d ile %d : %d\n", a, b, c);
            System.out.printf("  Numaraların  küçüğü %d ve %d : %d\n", a, b, d);


        }
    }

