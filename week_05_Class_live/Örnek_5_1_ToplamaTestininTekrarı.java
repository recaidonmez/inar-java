package week_05_Class_live;

import java.util.Scanner;

public class Örnek_5_1_ToplamaTestininTekrarı {
    public static void main(String[] args){

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.println(num1 + "+"+ num2 + "+"+ "=? " + "cevabı nedir?");
        int cevap = input.nextInt();

        while(num1+num2!=cevap){System.out.print("yanlış cevap vediniz"
                                +num1 +"+" + num2 + "\n cevabı nedir? ");
            cevap = input.nextInt();

        }
        System.out.println("doğru cevap");
        //4+9+=? cevabı nedir?
        //14
        //yanlış cevap vediniz4+9
        // cevabı nedir? 13
        //doğru cevap
    }
}
