package Week_4_live_class;

import java.util.Scanner;

public class Alıştırma_4_4_1_DizeOkumak {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print(" Boşluklarla ayırarak üç kelime giriniz\n: ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();

        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);

        System.out.println("Bir dize oluşturun ");
        String s = input.nextLine();
        System.out.println("Entır abasana kadar yazılan yazı " + s);

        //s1 is bahar
        //s2 is recai
        //s3 is betül
        //Bir dize oluşturun
        //Entır abasana kadar yazılan yazı  seher dönmez


    }

}
