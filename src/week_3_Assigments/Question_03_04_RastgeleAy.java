package week_3_Assigments;

import java.util.Scanner;

public class Question_03_04_RastgeleAy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayı = 1 + (int) (Math.random() * 12);

        System.out.println(sayı);

        if (1 == sayı) {
            System.out.println("ocak");
        }
        if (sayı == 2) {
            System.out.println("şubat");
        }
        if (sayı == 3) {
            System.out.println("mart");
        }
        if (sayı == 4) {
            System.out.println("nisan");
        }
        if (sayı == 5) {
            System.out.println("mayıs");
        }
        if (sayı == 6) {
            System.out.println("haziran");
        }
        if (sayı == 7) {
            System.out.println("temmuz");
        }
        if (sayı == 8) {
            System.out.println("ağustos");
        }
        if (sayı == 9) {
            System.out.println("eylül");
        }
        if (sayı == 10) {
            System.out.println("ekim");
        }
        if (sayı == 11) {
            System.out.println("kasım");
        }
        if (sayı == 12) {
            System.out.println("aralık");
        }

        //9
        //eylül
        //8
        //ağustos

    }
}
