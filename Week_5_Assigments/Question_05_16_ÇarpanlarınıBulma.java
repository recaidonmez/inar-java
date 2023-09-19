package Week_5_Assigments;

import java.util.Scanner;
    //(Bir tam sayının çarpanlarını bulun) Bir tam sayıyı okuyan ve onun en küçük çarpanlarını
    //artan sırada görüntüleyen bir program yazın. Örneğin giriş tam sayısı 120 ise çıkış
    //şu şekilde olmalıdır: 2, 2, 2, 3, 5.
public class Question_05_16_ÇarpanlarınıBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // tam sayı girmesini iste
        System.out.print("tam sayı girin: ");
        int sayı = input.nextInt();
        int dizin = 2; // test edilecek sayılar

        // En küçük faktörleri artan sırada bul ve göster
        while (sayı / dizin != 1) {
            // Sayının çarpsnını test et
            if (sayı % dizin == 0) {
                System.out.print(dizin + ", ");
                sayı /= dizin;
            } else
                dizin++; // dizini bir arttır.
        }
        System.out.println(sayı + ".");
    }
}
        //tam sayı girin: 132
//2, 2, 3, 11.
