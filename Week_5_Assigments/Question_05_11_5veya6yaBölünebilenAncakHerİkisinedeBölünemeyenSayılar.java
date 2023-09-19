package Week_5_Assigments;
    //(5 veya 6'ya bölünebilen ancak her ikisine de bölünemeyen sayıları bulun) Tüm sayıları görüntüleyen bir program yazın.
     //100'den 200'e kadar olan, satır başına on adet, 5 veya 6'ya bölünebilen ancak her ikisine de bölünemeyen sayılar.
    // Sayılar tam olarak bir boşlukla ayrılmış
public class Question_05_11_5veya6yaBölünebilenAncakHerİkisinedeBölünemeyenSayılar {
    public static void main(String[] args) {

        int sayaç = 0;

        for (int sayı = 100; sayı <= 200; sayı++) {
            if (sayı % 5 == 0 ^ sayı % 6 == 0) {  //sayı hem 5 hemde 6 ya bölünmiyecek.
                sayaç++;
                System.out.print(sayı);
                System.out.print(sayaç % 10 == 0 ? "\n" : " "); //? soru işareti buradan bize sayaç 0 a eşit ise sayi2 den sayi1’i döndürecek,
                                                    // sayi1 sayi2 den büyük değil ise ikinci parametre olan sayi2’yi dönderecektir.
            }
        }
    }
}
        //
        //100 102 105 108 110 114 115 125 126 130
        //132 135 138 140 144 145 155 156 160 162
        //165 168 170 174 175 185 186 190 192 195
        //198 200
