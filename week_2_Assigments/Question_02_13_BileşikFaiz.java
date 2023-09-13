package week_2_Assigments;

import java.util.Scanner;

public class Question_02_13_BileşikFaiz {
    public static void main(String[] args ) {

        Scanner input = new Scanner(System.in);

        //Aylık birikim tutarı gir.
        System.out.println("Aylık birikim tutarı gir");
        double birikim = input.nextDouble();

        double aylıkfaiz = (0.05 / 12);

        double bir = (birikim * aylıkfaiz);
        double iki = (birikim + bir) * (1 + aylıkfaiz);
        double üç = (birikim + iki) * (1 + aylıkfaiz ) ;
        double dört = (birikim + üç)  *(1 + aylıkfaiz) ;
        double beş = (birikim + dört)  * (1 + aylıkfaiz);
        double altı = (birikim + beş)  * (1 + aylıkfaiz);
        double yedi = (birikim + altı)  * (1 + aylıkfaiz);


        System.out.println("toplam para " + yedi);
    }

        //Aylık birikim tutarı gir
        //100
        //608.81 olması gerek.
}
