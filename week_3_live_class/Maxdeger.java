package week_3_live_class;

import java.util.Scanner;

public class Maxdeger {
    public static void main(String[] args){

    Scanner input =new Scanner(System.in);

    System.out.println("Rakam gir");
    int rakam1 = input.nextInt();

    System.out.println("Rakam gir");
    int rakam2 = input.nextInt();

    int max;
        max = (rakam1 > rakam2) ? rakam1 : rakam2;

        System.out.println("Max  " + max);

    }
}