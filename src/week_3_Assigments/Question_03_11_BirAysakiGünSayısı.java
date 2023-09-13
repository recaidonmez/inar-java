package week_3_Assigments;

import java.util.Scanner;

public class Question_03_11_BirAysakiGünSayısı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir ay gigrin");
        int ay = input.nextInt();

        System.out.println("Bir yıl girin");
        int yıl = input.nextInt();
    // şubat 4 yılsabir 29 çeker
        boolean artıkyıl = (yıl % 4 == 0 && yıl % 100 != 0) || (yıl % 400 == 0);

        switch (ay) {
            case 1:
                System.out.println("January " + yıl + " had 31 days");
                break;
            case 2:
                System.out.println("February " + yıl + " had " + (artıkyıl ? "29 days" : "28 days"));
                break;
            case 3:
                System.out.println("March " + yıl + " had 31 days");
                break;
            case 4:
                System.out.println("April " + yıl + " had 30 days");
                break;
            case 5:
                System.out.println("May " + yıl + " had 31 days");
                break;
            case 6:
                System.out.println("June " + yıl + " had 30 days");
                break;
            case 7:
                System.out.println("July " + yıl + " had 31 days");
                break;
            case 8:
                System.out.println("August " + yıl + " had 31 days");
                break;
            case 9:
                System.out.println("September " + yıl + " had 30 days");
                break;
            case 10:
                System.out.println("October " + yıl + " had 31 days");
                break;
            case 11:
                System.out.println("November " + yıl + " had 30 days");
                break;
            case 12:
                System.out.println("December " + yıl + " had 31 days");
                break;
            default:
                System.out.println("Invalid value");
                break;
        //Bir ay gigrin
            //3
            //Bir yıl girin
            //1996
            //March 1996 had 31 days

        }
    }
}
