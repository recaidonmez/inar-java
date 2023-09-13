package Week_4_live_class;

import java.util.Scanner;

public class Alıştırma_4_1_Açıları_Hesaplamak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan üç nokta girmesini iste
        System.out.println(" Kullanıcıdan üç nokta gir: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // Üç tarafı hesapla
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        //x >= 0 için x'in ("x) karekökünü döndürür .

        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        // Üç açıyı hesapla
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        //Derece cinsinden açı için açıyı derece cinsinden döndürür.

        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        // Ekranda göster
        System.out.println("Üç açilar " + Math.round(A * 100) / 100.0 + " " + Math.round(B * 100) / 100.0 + " " + Math.round(C * 100) / 100.0);

        // Kullanıcıdan üç nokta girmesini iste:
        //1
        //1
        //6,5
        //1
        //6,5
        //2,5
        //Üç açilar 15.26 90.0 74.74

    }
}
