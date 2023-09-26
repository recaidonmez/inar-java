package Week_6_Assigmets;

import java.util.Scanner;

public class Question_06_18_ŞifreyiKontrolEdin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Şifere girin");
        String şifre = input.nextLine();
        //şifre doğru ise doğru yanliş ise yanlış yazsın.
        /*uzun formül= if(doğruŞİfre(şifre) {
            System.out.println("doğru");
            }else}
                System.out.println("yanlış");
            }
         */
        System.out.println((geçerliŞifre(şifre) ? "doğru " : "yanlış" + "şifre"));

    }

    public static boolean geçerliŞifre(String şifre) {// boolean metod kullandık çünkü doğru yanlı sorusu var
        boolean sonuç = true;
        if ( ! geçerliUzunluk(şifre)) { // ! = geçerli uzunluk değilse demek
            System.out.println("şifre yeterli uzunlukta değil");
            sonuç = false;
        }
        if ( ! şifreRakamHarfMi(şifre)) {
            System.out.println("şifre rakam ve harf barındırmıyor");
            sonuç = false;
        }

        if (enAzİkiRakamMı(şifre)) {
            System.out.println("şifrede en az iki rakam olmalı");
            sonuç = false;
        }
        return sonuç;

    }

    public static boolean geçerliUzunluk(String şifre) {  //1. koşul geçerli uzunluk
        if (şifre.length() >= 8) {
            return true;
        }else{
          return false;
    }
}
    public static  boolean şifreRakamHarfMi(String şifre){ //2. koşul şifre rakam ve harf mi?
        for(int i = 0; i < şifre.length(); i++) {
            char ch = şifre.charAt(i);

            if(Character.isLetterOrDigit(ch)){
            /*YADA* -->
            if( ! ((ch >= "a" && ch <=  "z") || (ch >= "A" && ch <= "Z") || (ch >= "1" && ch <= "9"))){
             */ // bunların haricinde özel bir karekter istemiyorum.
                return false;
        }
    }
        return true;
}

public static boolean enAzİkiRakamMı(String şifre) { //3. koşul en az iki rakam olsun.
        int sayaç = 0;
        for(int i = 0; i <şifre.length(); i++) {
            char ch = şifre.charAt(i);
            if ( ch >= 0 && ch <= 9) {
                sayaç++;
                if (sayaç == 2 ) {

                    return true;
                }
            }
        }

        return  sayaç >= 2;

}
}
