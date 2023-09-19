package Week_5_Assigments;

import java.util.Scanner;
    //(Görüntü piramidi) Aşağıdaki örnek çalışmada gösterildiği gibi, kullanıcıdan 1'den 15'e
//kadar bir tam sayı girmesini isteyen ve bir piramit görüntüleyen bir program yazın

public class Question_05_17_PramitGörüntüsüYapma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // PKullanıcıdan 1'den 15'e kadar bir tamsayı girmesini iste
        System.out.print("Kaç satır olacakca sayı belirle: ");
        int satırSayısı = input.nextInt();

        // Pramidi görüntüle
        for (int satırlar = 1; satırlar <= satırSayısı; satırlar++) {
            // her satırda boşluk oluştur
            for (int s = satırSayısı - satırlar; s >= 1; s--) {
                System.out.print("  ");
            }
            //  Her satırda azalan sayılar oluşturun
            for (int l = satırlar; l >= 2; l--) {
                System.out.print(l + " ");
            }
            // er satırda artan sayı oluştur
            for (int r = 1; r <= satırlar; r++) {
                System.out.print(r + " ");
            }
            // son görüntü
            System.out.println();
        }
    }
}           //
//Kaç satır olacakca sayı belirt: 8
//              1
//            2 1 2
//          3 2 1 2 3
//        4 3 2 1 2 3 4
//      5 4 3 2 1 2 3 4 5
//    6 5 4 3 2 1 2 3 4 5 6
//  7 6 5 4 3 2 1 2 3 4 5 6 7
//8 7 6 5 4 3 2 1 2 3 4 5 6 7 8

