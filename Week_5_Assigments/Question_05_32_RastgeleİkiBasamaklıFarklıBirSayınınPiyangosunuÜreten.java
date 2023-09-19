package Week_5_Assigments;

import java.util.Scanner;
/*
(Oyun: piyango) İki haneli bir piyango oluşturmak için Liste 3.8, Lottery.java'yı revize edin
sayı. Numaradaki iki rakam birbirinden farklıdır. (İpucu: İlkini oluşturun
hane. Farklı olana kadar sürekli olarak ikinci rakamı oluşturmak için bir döngü kullanın
İlk rakamdan itibaren.)
*/
public class Question_05_32_RastgeleİkiBasamaklıFarklıBirSayınınPiyangosunuÜreten {

    public static void main(String[] args) {
    // Pİyangpyu oluştur.
    int piyangoRakamı1, piyangoRakamı2;
    piyangoRakamı1 = (int)(Math.random() * 10);

    do {
        piyangoRakamı2 = (int)(Math.random() * 10);

    } while (piyangoRakamı1 == piyangoRakamı2);

        // Kullanıcıdan bir tahmin girmesi isteniyor
    Scanner input = new Scanner(System.in);
    System.out.print("Piyango tahmininizi giriniz (iki farklı rakam): ");
    int tahmin = input.nextInt();

        // Tahminden rakamları al
    int tahminRakamı1 = tahmin / 10;
    int tahminRakam2 = tahmin % 10;

    System.out.println(

            "Pİyango numarası " + piyangoRakamı1 + piyangoRakamı2);

    // Tahmini kontrol et.
    if (tahminRakamı1 == piyangoRakamı1 &&
            tahminRakam2 == piyangoRakamı2)
        System.out.println(" 10,000 tl kazandın");
    else if (tahminRakam2 == piyangoRakamı1
            && tahminRakamı1 == piyangoRakamı2)
        System.out.println("3,000 tl kazandın");
    else if (tahminRakamı1 == piyangoRakamı1
            || tahminRakamı1 == piyangoRakamı2
            || tahminRakam2 == piyangoRakamı1
            || tahminRakam2 == piyangoRakamı2)
        System.out.println("1,000 tl kazandın");
    else
        System.out.println("üzgünüm kazanamadın");
}
}
    /*Piyango tahmininizi giriniz (iki farklı rakam): 98
Pİyango numarası 39
1,000 tl kazandın*/