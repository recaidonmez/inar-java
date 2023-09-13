package week_3_Assigments;

import java.util.Scanner;

public class Question_03_12_PalindromSayısı {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Üç basamaklı bir tam sayı girin");
        int sayı = input.nextInt();

        int s1 = (int) sayı / 100;
        int kalansayı =sayı % 100;
        int s3 =sayı % 10;

System.out.println(sayı + ((s1 == s3)  ? "  sayısı  " : "  polidrom değil ") + "  Polidromdur");


    //Üç basamaklı bir tam sayı girin
        //121
        //121sayısı  Polidromdur
    }
}
