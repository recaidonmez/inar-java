package Week_5_Assigments;

/*(Hesaplama) Aşağıdaki seriyi kullanarak p'yi yaklaşık olarak hesaplayabilirsiniz:*/
public class Question_05_25_HesaplamaSeriTtoplama {

    public static void main(String[] args) {
    //i = 10000 için PI değerini hesapla,
    double toplama = 0;
    double değer = 10000.0;
    for (double d = 1; d <= (2 * değer - 1); d += 2) {
        toplama += 1 / d;
        d += 2;
        toplama -= 1 / d;
    }
    double pi = 4 * toplama;

    // Ekranda göster
    System.out.println("PI value for i = 10000: " + pi);

        // i = 20000 için PI değerini hesapla,
    toplama = 0;
    değer = 20000.0;
    for (double d = 1; d <= (2 * değer - 1); d += 2) {
        toplama += 1 / d;
        d += 2;
        toplama -= 1 / d;
    }
    pi = 4 * toplama;

    // Ekranda göster
    System.out.println("PI value for i = 20000: " + pi);

    // i = 20000 için PI değerini hesapla,
    toplama = 0;
    değer = 100000.0;
    for (double d = 1; d <= (2 * değer - 1); d += 2) {
        toplama += 1 / d;
        d += 2;
        toplama -= 1 / d;
    }
    pi = 4 * toplama;

    // Sonucu göster
    System.out.println("PI value for i = 100000: " + pi);
}
}
    //PI value for i = 10000: 3.1414926535900345
    //PI value for i = 20000: 3.1415426535898248
    //PI value for i = 100000: 3.1415826535897198