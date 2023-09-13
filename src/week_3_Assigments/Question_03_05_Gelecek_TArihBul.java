package week_3_Assigments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Question_03_05_Gelecek_TArihBul {
    public static void main(String[] argd) {



        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen Bugünü girin");
        int bugün = input.nextInt();

        System.out.println("Bu günden sonra kaç gün geçsin");
        int gelecekGün =input.nextInt();

        int gün = (bugün + gelecekGün % 7);

        switch (gün) {
            case 0: System.out.println("Pazar");break;
            case 1:System.out.println("Pazartesi"); break;
            case 2: System.out.println("Salı");break;
            case 3:System.out.println("Çarşamba"); break;
            case 4:System.out.println("Perşembe"); break;
            case 5: System.out.println("Cuma");break;
            case 6:System.out.println("Cumartesi");
        }
        //Lütfen Bu günü girin
        //0
        //Bu günden sonra kaç gün geçsin
        //3
        //Çarşamba
        }
    }


