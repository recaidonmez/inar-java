package Week_4_live_class;

import java.util.Scanner;

public class Alıştırma_4_3_doğum_Gününü_TahminEtme {
    public static void main(String[] args) {
         String set1 =
                " 1 3 5 7\n" +
               " 9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31";

         String set2 =
                " 2 3 6 7\n" +
                 "10 11 14 15\n" +
                 "18 19 22 23\n" +
                 "26 27 30 31";

         String set3 =
                 " 4 5 6 7\n" +
                 "12 13 14 15\n" +
                 "20 21 22 23\n" +
                 "28 29 30 31";

         String set4 =
                 "8 9 10 11\n" +
                 "12 13 14 15\n" +
                 "24 25 26 27\n" +
                 "28 29 30 31";

        String set5 =
                 "16 17 18 19\n" +
                 "20 21 22 23\n" +
                 "24 25 26 27\n" +
                 "28 29 30 31";
                 int gün = 0;

         // tarayıcı oluştur
         Scanner input = new Scanner(System.in);

         // Prompt the user to answer questions
         System.out.print("Dogum günün set birdemi?\n");
         System.out.print(set1);
         System.out.print("\nEvet için 1 hayır için 0  tuşla ");
         int answer = input.nextInt();


        if (answer == 1)
             gün += 1;

         // Sorulara cevap verin;
         System.out.print("\nDoğum günün set 2 demi?\n");
         System.out.print(set2);
         System.out.print("\nEvet için 1 hayır için 0  tuşla: ");
         answer = input.nextInt();
         if (answer == 1)
             gün += 2;

         // Prompt the user to answer questions
         System.out.print("Doğum günün set 3 demi?\n");
         System.out.print(set3);
         System.out.print("\nEvet için 1 hayır için 0  tuşla: ");
         answer = input.nextInt();

         if (answer == 1)
             gün += 4;

         // Prompt the user to answer questions
         System.out.print("\nDoğum günün set 4 demi?\n");
         System.out.print(set4);
         System.out.print("\nEEvet için 1 hayır için 0  tuşla: ");
         answer = input.nextInt();

         if (answer == 1)
             gün += 8;

         // Prompt the user to answer questions
         System.out.print("\nDoğum günün set 5 demi?\n");
        System.out.print(set5);
         System.out.print("\nEvet için 1 hayır için 0  tuşla: ");
         answer = input.nextInt();

         if (answer == 1)
             gün += 16;

         System.out.println("\nDoğum günün " + gün + "!");
       }
 }

