package week_6_Class_live;

import java.util.Scanner;

public class Örnek_6_7_1_DesimalDeğer_OnaltılıkSayı {
    public static void main(String[] args) {
        // veri girişi
     Scanner input = new Scanner(System.in);
       ///Kullanıcıdan bir string girmesi isteniyor
       System.out.print("\"Onaltılık bir sayı giriniz: ");
     String hex = input.nextLine();

 System.out.println("Onaltılı sayının ondalık değeri "
              + hex + " şöyledir " + hexToDecimal(hex.toUpperCase()));  // büyük küçük harf algılar
        }

       public static int hexToDecimal(String hex) {
        int ondalıkdeğer = 0;

        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            ondalıkdeğer = ondalıkdeğer * 16 +
                 hexCharToDecimal(hexChar);
            }

        return ondalıkdeğer;
         }
 public static int hexCharToDecimal(char ch) {
         if (ch >= 'A' && ch <= 'F')
             return 10 + ch - 'A';
       else // ch ile '0', '1', ..., veya '9'
       return ch - '0';
      }
 }

/*
"Onaltılık bir sayı giriniz: abbc
Onaltılı sayının ondalık değeri abbc ve 43964*/

/*"Onaltılık bir sayı giriniz: af71
Onaltılı sayının ondalık değeri af71 şöyledir 44*/