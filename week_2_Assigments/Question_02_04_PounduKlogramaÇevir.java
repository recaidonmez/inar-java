package week_2_Assigments;

import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class Question_02_04_PounduKlogramaÇevir {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Bir pound miktarı girin :");

        double pound = input.nextDouble();

        double kilogram = pound * 0.454 ;

        System.out.println(pound +" pound " + kilogram + " kilogram yapar.");

        //girdi:55,5 çıktı: 25,197

    }

}
