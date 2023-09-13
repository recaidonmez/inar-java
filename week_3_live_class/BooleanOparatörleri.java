package week_3_live_class;

import java.util.Scanner;

public class BooleanOparatörleri {
    public static void main(String[] args) {

        //Bir tarayıcı oluştur.

        Scanner input = new Scanner(System.in);
        // tam sayı al
        System.out.println("Bir tam sayı gir");
        int sayı    = input.nextInt();

            // ve oparatörü
        if (sayı % 2 == 0 && sayı %3 == 0)
        System.out.println( sayı + " 2 ye 3 bölünebiliyor");

        // yada oparatörü
        if (sayı % 2 == 0 || sayı % 3 == 0)
            System.out.println(sayı +" 2 yada üçten birine bölünür");

        //özel veye opa
        if (sayı % 2 ==0 ^ sayı % 3 == 0)
        System.out.println( sayı + " 2 yada 3 ten birine bölür ama " +
                "ikisine birden bölünmesin");



    }
}
