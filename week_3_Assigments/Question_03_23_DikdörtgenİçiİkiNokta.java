package week_3_Assigments;

import java.util.Scanner;

public class Question_03_23_DikdörtgenİçiİkiNokta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İki koordinatlı (x,y) bir nokta giriniz : ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (Math.pow(Math.pow(x, 2), 0.5) <= 10.0 / 2 || Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2) {

            System.out.println("Nokta (" + x + "," + y + ") dikdörtgenin içinde ");

        } else {
            System.out.println("Nokta (" + x + "," + y + ") dikdörtgenin içinde değil");
        }

    }

}
 //İki koordinatlı (x,y) bir nokta giriniz : 2
//2
//Nokta (2.0,2.0) dikdörtgenin içinde


//İki koordinatlı (x,y) bir nokta giriniz : 6
//4
//Nokta (6.0,4.0) dikdörtgenin içinde değil
