package week_02.live_class;

import java.util.Scanner;

//Kullanıcıdan girdi alarak  hesap yapma.
public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {

        //Önce bir tarayıcı isteme nesnesi oluştur.
        Scanner input =new Scanner(System.in);

        //Kullanıcıdan bilgi girmesini iste.
        System.out.println("Lütfen bir yarıçap giriniz.");

        //istersen değeri sabitleye bilirsin
        final double Pİ = 3.14159;

        // nesne
        double yarıÇap = input.nextDouble();

        //Şimdi Hesaplama Alanı Oluştur.
        double alan = yarıÇap * yarıÇap * 3.14159;

        // Hesaplamayı göster.
        System.out.println("Çemberin yarıçapı " + yarıÇap + " olan " + alan);
    }
}   // girdi 2,5 çıktı 19,6349375

