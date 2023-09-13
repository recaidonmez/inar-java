package week_4_1_Assigmets;

import java.util.Scanner;

public class Question_04_09_KarakterinUnicodu {
    public static void main(String[] args){

        Scanner input =new Scanner(System.in);

        System.out.println("Bir harf girin: ");

        char harf = input.next().charAt(0);

        System.out.println((int)harf);

        //Bir harf girin:
        //E
        //69


    }
}
