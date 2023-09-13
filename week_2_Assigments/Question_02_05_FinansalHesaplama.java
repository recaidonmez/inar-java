package week_2_Assigments;

import java.util.Scanner;

public class Question_02_05_FinansalHesaplama {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //lira miktarırı iste
        System.out.println("Bir miktar lira girin");

         double lira    = input.nextDouble();

         double vergi = lira * 15 *100.0 ;

         double toplamlira = lira + vergi;

         System.out.println(lira + " girilen para miktarı " +  vergi +" vergi " +
                 toplamlira + " genel toplma ");
        //girdi:10,15  çıktı :1,5----11,5
    }

}
