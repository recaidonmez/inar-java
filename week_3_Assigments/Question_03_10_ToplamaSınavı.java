package week_3_Assigments;

import java.util.Scanner;

public class Question_03_10_ToplamaSınavı {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //  100 sen iki küçük tam sayı iste
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        // Rakamlar toplamını sor
        System.out.print( number1 + " + " + number2 + "toplamı  = ? ");
        int cevap = input.nextInt();

        // ekranda göster
        if (number1 + number2 == cevap)
            System.out.println("Doğru cevap !!");
        else
            System.out.println("Yanlış cevap !! " + number1 + " + " + number2
                                        + " olmsı gereken "+ (number1 + number2));

    //21 + 10toplamı  = ? 31
        //Doğru cevap !!

        //92 + 79toplamı  = ? 456
        //Yanlış cevap !! 92 + 79 olmsı gereken 171


    }

}
