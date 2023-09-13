package week_2_Assigments;

import java.util.Scanner;

public class Question_02_12_PistUzunluğu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir hızını giriniz");

        double hız = input.nextDouble();


        System.out.println("Lütfen bir kalkış hızını giriniz");

        double kalkışHızı = input.nextDouble();


        System.out.println((hız * hız) / (2 * kalkışHızı));




    }
}
