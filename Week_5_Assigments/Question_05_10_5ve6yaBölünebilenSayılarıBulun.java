package Week_5_Assigments;
        //(5 ve 6'ya bölünebilen sayıları bulun) 100'den 1.000'e kadar, 5 ve 6'ya bölünebilen tüm sayıları her
        //satırda on tane olmak üzere görüntüleyen bir program yazın. Sayılar tam olarak bir boşlukla
        //ayrılmıştır.
public class Question_05_10_5ve6yaBölünebilenSayılarıBulun {
    public static void main(String[] args) {
        int sayaç = 0;
        for (int sayı = 100; sayı <= 1000; sayı++) {   //sayı 100 ile 1000 arasında bir aratarak gider ve
            if (sayı % 5 == 0 && sayı % 6 == 0) {   //  5 ve 6 ya tam (mod) bölünürese 0 ona eşit olur.
                sayaç++;
                System.out.print(sayı);
                System.out.print((sayaç % 10 == 0 ? "\n" : " "));
            }
        }
    }
}
        //
//120 150 180 210 240 270 300 330 360 390
//420 450 480 510 540 570 600 630 660 690
//720 750 780 810 840 870 900 930 960 990
