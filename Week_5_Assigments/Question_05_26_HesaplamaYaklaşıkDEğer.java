package Week_5_Assigments;
/*
(Hesaplama e) Aşağıdaki seriyi kullanarak e'yi yaklaşık olarak hesaplayabilirsiniz:
    e = 1 + 1/1! + 1/2! + 1/3! + 1/4! + ... + 1 / ben!
i = 10000, 20000,… ve için e değerini görüntüleyen bir program yazınız.
100000. (İpucu: Çünkü i! = i * (i - 1) * c * 2 * 1, o zaman
    1 / ben! 1 / (i(i - 1)!)
e ve item'ı 1 olarak başlatın ve e'ye yeni bir öğe eklemeye devam edin. Yeni öğe
i = 2, 3, 4, .... için önceki öğenin i'ye bölünmesi
*/
public class Question_05_26_HesaplamaYaklaşıkDEğer {
    public static void main(String[] args) {
    double e = 1.0,
            değer = 10000.0;
    // i = 10000 için e değerini hesapla

    for (double i = 1; i <= değer; i++) {
        double payda = i;
        for (double k = i - 1; k >= 1; k--) {
            payda *= k;
        }
        e += 1 / payda;
    }

    //Sonucu göster
    System.out.println("i'nin e değeri = 10000: " + e);

        // i = 100000 için e değerini hesapla
    e = 1.0;
    değer = 20000.0;
    for (double i = 1; i <= değer; i++) {
        double payda = i;
        for (double k = i - 1; k >= 1; k--) {
            payda *= k;
        }
        e += 1 / payda;
    }

    // display result
    System.out.println( "i = 20000 için e değeri: " + e);

        // i = 100000 için e değerini hesapla
    e = 1.0;
    değer = 100000.0;
    for (double i = 1; i <= değer; i++) {
        double payda = i;
        for (double k = i - 1; k >= 1; k--) {
            payda *= k;
        }
        e += 1 / payda;
    }

    // Display result
    System.out.println( "i'nin e değeri = 100000: " + e);
}
}
    /*i'nin e değeri = 10000: 2.7182818284590455
i = 20000 için e değeri: 2.7182818284590455
i'nin e değeri = 100000: 2.7182818284590455*/