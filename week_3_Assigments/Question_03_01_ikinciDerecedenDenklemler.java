package week_3_Assigments;

import java.util.Scanner;

public class Question_03_01_ikinciDerecedenDenklemler {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("a değerini girin");
        double a = input.nextDouble();

        System.out.println("b değerini girin");
        double b = input.nextDouble();

        System.out.println("c değerini girin");
        double c = input.nextDouble();


        double d = b * b - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.pow(d,0.5)) / (2 * a);
            double r2 = (-b - Math.pow(d,0.5)) / (2 * a);
            System.out.println("İki ayrı gerçek kök:");
            System.out.println("R 1: " + r1);
            System.out.println("R 2: " + r2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Bir gerçek kök (tekrarlanan kök):");
            System.out.println("Kök: " + root);
        } else  {
            double realPart = -b / (2 * a);
            double hayaliölüm = Math.sqrt(-d) / (2 * a);
            System.out.println("İki karmaşık kök:");
            System.out.println("Kök 1: " + realPart + " + " + hayaliölüm + "i");
            System.out.println("Kök 2: " + realPart + " - " + hayaliölüm + "i");
        }
    // a değerini girin
        //1,0
        //b değerini girin
        //3
        //c değerini girin
        //1
        // olması gereken; -0,381966 ile -2,61803


    }
}
