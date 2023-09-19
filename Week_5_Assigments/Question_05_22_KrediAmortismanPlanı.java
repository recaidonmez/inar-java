package Week_5_Assigments;

import java.util.Scanner;
        //Finansal uygulama: kredi amortisman planı) Belirli bir kredinin aylık ödemesi anapara ve faizi öder. Aylık
        //faiz, aylık faiz oranı ile bakiyenin (kalan anapara) çarpılmasıyla hesaplanır. Bu nedenle, ay için ödenen
        //anapara, aylık ödemeden aylık faizin çıkarılmasıyla elde edilen tutardır. Kullanıcının kredi tutarını,
        //yıl sayısını ve faiz oranını girmesini sağlayan ve kredinin amortisman planını görüntüleyen bir
        //program yazın. İşte örnek bir çalışma:
public class Question_05_22_KrediAmortismanPlanı {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Kredi Tutarı: ");
    double krediTutarı = input.nextDouble();
    System.out.print("Yıl Sayısı: ");
    int yılSayısı = input.nextInt();
    System.out.print("Yıllık Faiz Oranı: ");

    double yıllıkOran = input.nextDouble();
    double aylıkFaizOranı = yıllıkOran / 1200;
    double aylıkÖdeme = krediTutarı * aylıkFaizOranı / (1 - 1 / Math.pow(1 + aylıkFaizOranı, yılSayısı * 12));

    System.out.printf("\nAylık Ödeme: %.2f\n", aylıkÖdeme);

    System.out.printf("Toplam Ödeme: %.2f\n", (aylıkÖdeme * 12) * yılSayısı);

    double ortalama = krediTutarı;
    double anaPara;
    double faiz;

    System.out.println("\nÖdeme#     Faiz Anapara   Bakiyesi");

    for (int i = 1; i <= yılSayısı * 12; i++) {
        faiz = aylıkFaizOranı * ortalama;
        anaPara = aylıkÖdeme - faiz;
        ortalama = ortalama - anaPara;

        System.out.printf("%-13d%-13.2f%-14.2f%.2f\n", i, faiz, anaPara, ortalama);
    }
}
}
    //
    //Kredi Tutarı: 1000
//Yıl Sayısı: 1
//Yıllık Faiz Oranı: 7
//
//Aylık Ödeme: 86,53
//Toplam Ödeme: 1038,32
//
//Ödeme#     Faiz Anapara   Bakiyesi
//1            5,83         80,69         919,31
//2            5,36         81,16         838,14
//3            4,89         81,64         756,50
//4            4,41         82,11         674,39
//5            3,93         82,59         591,80
//6            3,45         83,07         508,72
//7            2,97         83,56         425,16
//8            2,48         84,05         341,12
//9            1,99         84,54         256,58
//10           1,50         85,03         171,55
//11           1,00         85,53         86,02
//12           0,50         86,02         0,00