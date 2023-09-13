package week_3_Assigments;

import java.util.Scanner;

public class Question_03_27_ÜçgendekiNoktalar {
    public static void main(String[] args ){

      Scanner input= new Scanner(System.in);
    System.out.println("Bir noktanın x ve y kordinatlarını girin");

    double x =input.nextDouble();
    double y =input.nextDouble();

        if (y <= -x / +100 && x > 0 && y > 0) {
            System.out.println("nokta üçgenin içindedir");

        }else{
            System.out.println("nokta üçgenin içinde degildir");
        }


    }
}
