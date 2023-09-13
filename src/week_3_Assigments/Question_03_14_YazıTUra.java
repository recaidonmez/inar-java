package week_3_Assigments;

import java.util.Scanner;

public class Question_03_14_YazıTUra {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Yazı-tura atışını tahmin edin (0 yazı, 1 turayı temsil eder ");
        int kullanıcı = input.nextInt();

        int jeton = (int) (Math.random() * 2);

        if (kullanıcı == jeton) {
            System.out.println("Tahmininiz doğrudur");
        } else {
            System.out.println("Tahmininiz yanlış.");

        }
    }
}       //1
    //Tahmininiz yanlış.


