package week_6_Class_live;

import java.util.Scanner;

public class Örnek_6_6_Modülleme_EnBüyükOrtakBöleniBulma {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);

         System.out.println("numara biri gir");
         int num1 =input.nextInt();

        System.out.println("numara biri gir");
        int num2 =input.nextInt();

        int gcd =gcd(num1, num2);

        System.out.println(num1 +" ve "+ num2 +" için en büyük ortak bölen " + gcd + " dir ");
    }

        public static int gcd(int num1, int num2){
        int gcd =1;
        int bölen =2;
        while (bölen<=Math.min(num1, num2)){
            if(num1 % bölen ==0 && num2 % bölen ==0){
                gcd =bölen;
            }
            bölen++;
        }
return gcd; //RETURN DEN SONRA KOD ÇALIŞMAZ.....
}
}