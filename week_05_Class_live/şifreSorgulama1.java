package week_05_Class_live;

import java.util.Date;
import java.util.Scanner;

public class şifreSorgulama1 {




            public static void main(String[] args) {
            // Kullanıcı eğer üç kere üst üste yanlış PASSWORD girerse "Access denied !"
            // Kullanıcın yanlış giriş yaptığı zamnları bir stringte toplasın ve kullanıcı başarılı giriş yaptığında kullanıcıyı uyarsın
            // Kullanıcı her yanlış giriş yaptığında şifrenin yanlış olduğunu ve kaç hakkı kaldığını söylesin
            // isAcceesGranted (boolean) --> For  - -> if --> break;  --> else

            Scanner input = new Scanner(System.in);
            Date date = new Date();

            final String ŞİFRE = "kullanıcı1234";
            final int EN_FAZLA_GİRİŞ = 3;
            String girişSayısıYazısı = "";
            boolean erişimeİzinVerildimi = false;


            for (int i = 1 ; i <= EN_FAZLA_GİRİŞ; i++){

                System.out.print("ŞİFRE gir : ");
                String kullanıcıŞifresi = input.nextLine();

                if(kullanıcıŞifresi.equals(ŞİFRE)){
                    System.out.println("Erişim izni verildi");
                    erişimeİzinVerildimi = true;

                    System.out.println("\n" + girişSayısıYazısı);
                    break;

                }else{
                    System.out.println("Yanlış Şifre.Giriş hakkın  : " + (EN_FAZLA_GİRİŞ - i) +"  kaldı");
                    girişSayısıYazısı += i + " - " + date.toString() + "\n";
                }

            }
            if(!erişimeİzinVerildimi){      //eğer false ise
                System.out.println("Erişim Engellendi");
            }

        }
    }

    //
//  ŞİFRE gir : 6464
//Yanlış Şifre.Giriş hakkın  : 2  kaldı
//ŞİFRE gir : 4456
//Yanlış Şifre.Giriş hakkın  : 1  kaldı
//ŞİFRE gir : kullanıcı1234
//Erişim izni verildi
//1 - Tue Sep 12 00:29:42 TRT 2023
//2 - Tue Sep 12 00:29:42 TRT 2023