package week_2_Assigments;

import java.util.Scanner;

public class Question_02_10_BilimEnerjiHesaplama {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        //Su miktarını kilogram cinsinden iste
        System.out.println("Su miktarırını kg cinsinden girin : ");
        double suMiktarı = input.nextDouble();

        //ilk ısıyı girirn

        System.out.println("İlk ısıyı girin : ");
        double ilkIsı = input.nextDouble();

        System.out.println("Son ısıyı girin : ");
        double sonIsı = input.nextDouble();

        System.out.println(" Gereken Enerji: " + suMiktarı * (sonIsı - ilkIsı) * 4184);


    //55,5
        //İlk ısıyı girin :
        //3,5
        //Son ısıyı girin :
        //10,5
        // Gereken Enerji: 1625484.0
    }
}
