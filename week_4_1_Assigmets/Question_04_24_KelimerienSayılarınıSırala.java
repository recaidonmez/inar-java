package week_4_1_Assigmets;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Question_04_24_KelimerienSayılarınıSırala {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Üç tane şehir ismi girin");

        int max;

        String şehir1 = input.nextLine();
        String şehir2 = input.nextLine();
        String şehir3 = input.nextLine();

        int a = şehir1.length();
        int b = şehir2.length();
        int c = şehir3.length();

        int tempMax = Math.max(a, b);
        max = Math.max(tempMax, c);

        System.out.println(şehir1 + " harf sayısı "
                + şehir1.length());
        System.out.println(şehir2 + " harf sayısı "
                + şehir2.length());
        System.out.println(şehir3 + " harf sayısı "
                + şehir3.length());

        System.out.println("Büyükten küçüğe sıra" + max);


    }
}
