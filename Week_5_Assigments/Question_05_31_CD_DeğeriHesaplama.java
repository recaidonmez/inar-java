package Week_5_Assigments;
        /*Kullanıcıdan bir miktar (örneğin 10000) girmesini isteyen bir program yazınız.
yıllık yüzde getirisi (örneğin, 5,75) ve ay sayısı (örneğin, 18) ve
örnek çalışmada gösterildiği gibi bir tablo görüntüler.
*/

import java.util.Scanner;

public class Question_05_31_CD_DeğeriHesaplama {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        // Kullanıcıdan bir miktar girmesi isteniyor,
        // yıllık yüzde getirisi ve ay sayısı
    System.out.print("İlk yatırılan tutarı giriniz:");
    double miktar = input.nextDouble();

    System.out.print("Yıllık getiri yüzdesini giriniz:");
    double getiriYüzdesi = input.nextDouble();

    System.out.print("Vade süresini giriniz (ay sayısı): " );
    int aylar = input.nextInt();

        // Başlığı göster
    System.out.println("Ay CD Değeri");

        // Ay sayısına göre CD değerini hesaplayın ve görüntüleyin

    for (int m = 1; m <= aylar; m++) {
        miktar += miktar * (getiriYüzdesi / 1200);
        System.out.printf("%-7d%.2f\n", m, miktar);
    }
}
}
    /*İlk yatırılan tutarı giriniz:10000
Yıllık getiri yüzdesini giriniz:5,75
Vade süresini giriniz (ay sayısı): 18
Ay CD Değeri
1      10047,92
2      10096,06
3      10144,44
4      10193,05
5      10241,89
6      10290,97
7      10340,28
8      10389,82
9      10439,61
10     10489,63
11     10539,89
12     10590,40
13     10641,14
14     10692,13
15     10743,37
16     10794,84
17     10846,57
18     10898,54*/