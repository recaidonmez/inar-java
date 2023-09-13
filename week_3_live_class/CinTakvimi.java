package week_3_live_class;

import java.util.Scanner;

public class CinTakvimi {
    public static void main (String[] args){

        Scanner input =new Scanner(System.in);

        System.out.println("Yıl giriniz.");
        int yıl = input.nextInt();

        //Çin Burcu, on iki yıllık bir döngüye dayanmaktadır.

switch ( yıl % 12 ) {
     case 0: System.out.println("maymun");break;
     case 1: System.out.println("horoz");break;
     case 2: System.out.println("köpek");break;
     case 3: System.out.println("domuz");break;
     case 4: System.out.println("fare");break;
     case 5: System.out.println("boğa");break;
     case 6: System.out.println("kaplan");break;
     case 7: System.out.println("tavşan");break;
     case 8: System.out.println("ejderha");break;
     case 9: System.out.println("yıla");break;
     case 10: System.out.println("at");break;
     case 11: System.out.println("koyun");

        //Yıl giriniz.
         //2023
         //tavşan
}


    }
}
