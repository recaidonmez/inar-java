package Week_5_Assigments;

import java.util.Scanner;
    //Finansal uygulama: kredileri çeşitli faiz oranlarıyla karşılaştırın) Kullanıcının kredi tutarını
    //ve kredi süresini yıl cinsinden girerek %5'ten %8'e kadar her faiz oranı için aylık ve toplam
    //ödemeleri görüntüleyen bir program yazınız. 1/8 oranında artırılır.
public class Question_05_21_FaizHesabı {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        //Kullanıcıdan kredi tutarını girmesini isteyin ve
        // yıl sayısı cinsinden kredi süresi
    System.out.print("Kredi tutarı: ");
    double krediTutarı = input.nextDouble();
    System.out.print("Yıl sayısı: ");
    int yılSayısı = input.nextInt();

    // Tablo başlığını göster
    System.out.println(
            "Faiz Oranı     Aylık Ödeme  Toplam Ödeme");

    // Faiz oranlarını içeren tabloyu göster
    for (double i = 5.0; i <= 8; i += 0.125) {
        System.out.printf("%-5.3f", i);
        System.out.print("%           ");
        double aylıkFaizOranı = i / 1200;
        double aylıkÖseme = krediTutarı * aylıkFaizOranı
                / (1 - 1 / Math.pow(1 + aylıkFaizOranı, yılSayısı * 12));
        System.out.printf("%-19.2f", aylıkÖseme);
        System.out.printf("%-8.2f\n", (aylıkÖseme * 12) * yılSayısı);
    }
}
}
    //
    //Kredi tutarı: 10000
//Yıl sayısı: 5
//Faiz Oranı     Aylık Ödeme  Toplam Ödeme
//5,000%           188,71             11322,74
//5,125%           189,29             11357,13
//5,250%           189,86             11391,59
//5,375%           190,44             11426,11
//5,500%           191,01             11460,70
//5,625%           191,59             11495,35
//5,750%           192,17             11530,06
//5,875%           192,75             11564,84
//6,000%           193,33             11599,68
//6,125%           193,91             11634,59
//6,250%           194,49             11669,56
//6,375%           195,08             11704,59
//6,500%           195,66             11739,69
//6,625%           196,25             11774,85
//6,750%           196,83             11810,08
//6,875%           197,42             11845,37
//7,000%           198,01             11880,72
//7,125%           198,60             11916,14
//7,250%           199,19             11951,62
//7,375%           199,79             11987,16
//7,500%           200,38             12022,77
//7,625%           200,97             12058,44
//7,750%           201,57             12094,18
//7,875%           202,17             12129,97
//8,000%           202,76             12165,84
//
