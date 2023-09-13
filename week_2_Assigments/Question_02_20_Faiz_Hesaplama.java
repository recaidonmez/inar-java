package week_2_Assigments;

import java.util.Scanner;

public class Question_02_20_Faiz_Hesaplama {
    public static void main(String[] args){

       Scanner input =new Scanner(System.in);

       System.out.println("bakiye girin   :");
       double bakiye = input.nextDouble();

        System.out.println("Faiz Oranı girin   :");

       double faizOranı = input.nextDouble();

       System.out.println("Faiz   :" +  bakiye * ((3.5) / 1200) );

       //bakiye girin   :
        //1000
        //Faiz Oranı girin   :
        //3,5
        //Faiz   :2.916666666666667

    }
}
