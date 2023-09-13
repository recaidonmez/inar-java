package Week_4_live_class;

import java.util.Scanner;

public class Alıştırma_4_5_2_OnaltılıBirBasamağıOndalıkDeğereDönüştürme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         System.out.print("Onaltılık bir rakam giriniz: ");
         String hexString = input.nextLine();

        // Onaltılı dizgenin tam olarak bir karakter içerip içermediğini kontrol edin

        if (hexString.length() != 1) {
             System.out.println(" Tam olarak bir karakter girmelisiniz");
             System.exit(1);
             }

        // Onaltılı basamak için ondalık değeri göster

         char ch = hexString.charAt(0);
         if (ch <= 'F' && ch >= 'A') {
             int value = ch - 'A' + 10;
           System.out.println(" Onaltılık sayının ondalık değeri "
                     + ch + "  dır-dir  " + value);
             } else if (Character.isDigit(ch)) {
             System.out.println("\" Onaltılık sayının ondalık değer "
                   + ch + "  dır-dir  " + ch);
             } else {
             System.out.println(ch + " geçersiz bir giriştir");


             //Onaltılık bir rakam giriniz: AB7C
             // Tam olarak bir karakter girmelisiniz

             //Onaltılık bir rakam giriniz: B
             // Onaltılık sayının ondalık değeri B  dır-dir  11

             //Onaltılık bir rakam giriniz: T
             //T geçersiz bir giriştir
             }
        }
 }

