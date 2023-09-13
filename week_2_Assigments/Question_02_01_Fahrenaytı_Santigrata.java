package week_2_Assigments;

import java.util.Scanner;

public class Question_02_01_Fahrenaytı_Santigrata {

    public static void main(String[] args){

        // Veri almak için nesne oluştur
        Scanner input =new Scanner(System.in);

        System.out.println("Bir sıcaklık derecesi girin : ");

        // nesne
        double santigrat = input.nextDouble();

        double fahrenayt = (9/5.0) * santigrat + 32;

        System.out.println( santigrat + ": Derece " + fahrenayt + " :Fahrenayt yapar. ");

        //girdi: 43 çıktı:109,4
            }
}
