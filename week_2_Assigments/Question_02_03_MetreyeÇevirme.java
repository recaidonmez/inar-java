package week_2_Assigments;

import java.util.Scanner;

public class Question_02_03_MetreyeÇevirme {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen fit için bir değer girin");

        double fit =  input.nextDouble();

        double metre    = fit * 305 / 1000;

        System.out.println(fit + " Fit " + metre + " metre dir.");

        //girdi:16,5 çıktı:5,0325
    }
}
