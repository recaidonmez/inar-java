package week_3_Assigments;

import java.util.Scanner;

public class Question_03_09_ISBNKonturolEt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(":ISBN'nin ilk 9 basamağını tamsayı olarak girin ");
        int isbn = input.nextInt();

        int d1 = (isbn / 100000000);
        int d2 = (isbn / 10000000) % 10;
        int d3 = (isbn / 1000000) % 10;
        int d4 = (isbn / 100000) % 10;
        int d5 = (isbn / 10000) % 10;
        int d6 = (isbn / 1000) % 10;
        int d7 = (isbn / 100) % 10;
        int d8 = (isbn / 10) % 10;
        int d9 = (isbn / 1) % 10;
        int toplamanınSağlaması = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        if (toplamanınSağlaması == 10) {
            if (d1 == 0) {
                System.out.println("ISMB 10 numarası " + "0" + isbn + "X");
            } else {
                if (d1 == 0) {
                    System.out.println("ISMB 10 numarası " + "0" + isbn + "X");
                } else
                    System.out.println("ISMB 10 numarasıs " + isbn + "X");
            }
            if (d1 == 0) {
                System.out.println("ISMB 10 numarasıs " + "0" + isbn + "" + toplamanınSağlaması);
            } else if (d1 == 0) {
                System.out.println("ISMB 10 numarası " + "0" + isbn + "" + toplamanınSağlaması);
            } else
                System.out.println("ISMB 10 numarası " + isbn + "" + toplamanınSağlaması);
        }
    }
}



