package week_3_Assigments;

import java.util.Scanner;

public class Question_03_02_Oyun {
     public static void main(String[] args ){
        Scanner input = new Scanner(System.in);

        // rakamalrı random al
         int a =  (int) (Math.random() * 10);
         int b =  (int)(Math.random()  * 10);
         int c =  (int)(Math.random() * 10);

         int sonuç = a+b+c;

         //Soruyu sor
         System.out.println( a + "+" + b +"+" + c +" + " + "= ?");
         int cevap = input.nextInt();

         if( sonuç == cevap ); {

          System.out.println(a + "+" + b +"+" + c +" + " + "=   " +cevap +
                  "    " + (sonuç == cevap) +"    Doğrusu ---->" + cevap );
    }
     }
}
