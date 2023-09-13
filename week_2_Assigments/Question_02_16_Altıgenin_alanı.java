package week_2_Assigments;

import java.util.Scanner;

public class Question_02_16_Altıgenin_alanı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir kenar girin lütfen" );
        double kenar = input.nextDouble();

        System.out.println(" Alan : " + (3 * Math.sqrt(3)) / 2 * Math.pow(kenar,2));


        //Bir kenar girin lütfen
        //5,5
        // Alan : 78.59180539343781
    }
}
