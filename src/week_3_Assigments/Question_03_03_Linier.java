package week_3_Assigments;

import java.util.Scanner;

public class Question_03_03_Linier {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("a değerini girin");
        double a = input.nextDouble();
        System.out.println("b değerini girin");
        double b = input.nextDouble();
        System.out.println("c değerini girin");
        double c = input.nextDouble();
        System.out.println("d değerini girin");
        double d = input.nextDouble();
        System.out.println("e değerini girin");
        double e = input.nextDouble();
        System.out.println("f değerini girin");
        double f = input.nextDouble();

        double sonuç = a * d - b * c;

        if (sonuç == 0) {
            System.out.println("Denklem tam oldu:" + sonuç + " = 0");
        } else {
            System.out.println("\"Denklemin çözümü yok:" + sonuç + " = 0 değil.");
    }
}
}