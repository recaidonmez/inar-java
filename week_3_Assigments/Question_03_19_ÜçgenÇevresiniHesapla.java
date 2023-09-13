package week_3_Assigments;

import java.util.Scanner;

public class Question_03_19_ÜçgenÇevresiniHesapla {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Üçgenin üç kenarını girin:\n");

    double s1 = input.nextDouble();
    double s2 = input.nextDouble();
    double s3 = input.nextDouble();

    if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
        System.out.print("Çevresi " + (s1 + s2 + s3));
    } else {
        System.out.print("Geçersiz giriş");

    }

}
}
//Üçgenin üç kenarını girin:
//3
//   4
//   5
//   Çevresi 12.0

//Üçgenin üç kenarını girin:
//1
//0
//2
//Geçersiz giriş

