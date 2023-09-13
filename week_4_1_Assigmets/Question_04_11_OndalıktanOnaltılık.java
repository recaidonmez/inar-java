package week_4_1_Assigmets;

import java.util.Scanner;

public class Question_04_11_OndalıktanOnaltılık {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcıdan ondalık:\n0-15 arasında sayı girmesini isteyelim");

        int ondalik_Sayi = input.nextInt();

        // Girilen sayıyı onaltılık olarak görüntüleyelim

        if (ondalik_Sayi >= 0 && ondalik_Sayi <= 15) {

            String onaltılı = Integer.toHexString(ondalik_Sayi);

            System.out.print("Onaltılık Karşılığı   :"+ onaltılı);

        } else {
            System.out.println("Geçersiz giriş!:\n0 ile 15 arasında bir tamsayı giriniz.");

        //0-15 arasında sayı girmesini isteyelim    //11      //Onaltılık Karşılığı   :b

            //0-15 arasında sayı girmesini isteyelim
            //5
            //Onaltılık Karşılığı   :5

            //0-15 arasında sayı girmesini isteyelim
            //31
            //Geçersiz giriş!:
            //0 ile 15 arasında bir tamsayı giriniz.


        }
    }
}
