package Week_4_live_class;

import java.util.Scanner;

public class Alıştırma_4_2_6_ÜçGeninİçAçılarınıHesaplama {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // KUllanıcısan üç nokta girmesini iste
        System.out.print("Üç nokta girin ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Üçtarafı hesapla   Math.sqrt:kare kök bulma

        double a = Math.sqrt((x2 - x3) * (x2 - x3)
                + (y2 - y3) * (y2 - y3));

        double b = Math.sqrt((x1 - x3) * (x1 - x3)
                + (y1 - y3) * (y1 - y3));

        double c = Math.sqrt((x1 - x2) * (x1 - x2)
                + (y1 - y2) * (y1 - y2));
        // Üç açıyı hesapla

        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c)
                / (-2 * b * c)));

        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c)
                / (-2 * a * c)));

        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a)
                / (-2 * a * b)));
        // Display results
        System.out.println("Üç açı " +
                Math.round(A * 100) / 100.0 + " " + //Math.raound=Aşağıya tuvarlar.
                Math.round(B * 100) / 100.0 + " " +
                Math.round(C * 100) / 100.0);

        //Üç nokta girin 1
        //1
        //6,5
        //1
        //6,5
        //2,5
        //Üç açıe 15.26 90.0 74.74
    }

}