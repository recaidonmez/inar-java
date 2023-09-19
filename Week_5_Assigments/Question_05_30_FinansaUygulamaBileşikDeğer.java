package Week_5_Assigments;
    /*
(Finansal uygulama: bileşik değer) Her ay 100$ tasarruf ettiğinizi varsayalım.
yıllık faiz oranı %5 olan bir tasarruf hesabına yatırın. Yani aylık faiz
oranı 0,05 / 12 = 0,00417'dir. İlk aydan sonra hesaptaki değer
					100 * (1 + 0,00417) = 100,417
İkinci aydan sonra hesaptaki değer
					(100 + 100,417) * (1 + 0,00417) = 201,252
Üçüncü aydan sonra hesaptaki değer
					(100 + 201,252) * (1 + 0,00417) = 302,507
ve benzeri.
Kullanıcıdan yıllık bir miktar (örneğin 100) girmesini isteyen bir program yazınız.
faiz oranını (örneğin 5) ve ay sayısını (örneğin 6) ve tutarı görüntüler
belirtilen aydan sonra tasarruf hesabında.
*/
import java.util.Scanner;

public class Question_05_30_FinansaUygulamaBileşikDeğer {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        // Kullanıcıdan bir tutar girmesi isteniyor,
        // yıllık faiz oranı ve ay sayısı
    System.out.print("Bir tutar giriniz (örn. 100):");
    double tutar = input.nextDouble();

    System.out.print("Yıllık faiz oranını giriniz (örn. 5): ");
    double yıllıkFaizOranı = input.nextDouble();

    System.out.print( "Ay sayısını giriniz (ör. 6) ");
    int aylar = input.nextInt();

        // Aylık faiz oranını hesapla
    double aylıkFaizOranı = yıllıkFaizOranı / 1200;

        // Belirtilen aydan sonra tasarruf hesabındaki tutarı hesapla
    double bileşikDeğer = 0; //  Bileşik değerini toplar
    for (int m = 1; m <= aylar; m++) {
        bileşikDeğer = (tutar + bileşikDeğer) * (1 + aylıkFaizOranı);
    }


    System.out.printf(
            "Bundan sonra tasarruf hesabındaki tutar"  +
                    aylar + " aylar: $%.2f\n", bileşikDeğer);
}
}
    /*Bir tutar giriniz (örn. 100):100
Yıllık faiz oranını giriniz (örn. 5): 5
Ay sayısını giriniz (ör. 6) 6
Bundan sonra tasarruf hesabındaki tutar6 aylar: $608,81*/