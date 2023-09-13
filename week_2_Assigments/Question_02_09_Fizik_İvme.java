package week_2_Assigments;

import java.util.Scanner;

public class Question_02_09_Fizik_İvme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("vo gir");
        double v0 = input.nextDouble();

        System.out.println("v1 gir");
        double v1 = input.nextDouble();

        System.out.println("Zaman gir");
        double zaman = input.nextDouble();

        System.out.println("ortalama ivmesi" + (v1 - v0) / zaman) ;
    }
}
        //5vo gir
        //5,5
        //v1 gir
        //50,9
        //Zaman gir
        //4,5
        //ortalama ivmesi10.088888888888889