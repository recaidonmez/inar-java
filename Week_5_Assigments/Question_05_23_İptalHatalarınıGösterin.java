package Week_5_Assigments;
/*
(İptal hatalarını gösterin) Aşağıdaki durumlarda bir iptal hatası oluşur:
çok büyük bir sayıyı çok küçük bir sayıyla değiştirmek. Büyük sayı
küçük sayıyı iptal edebilir. Örneğin, 100000000.0 + sonucunun sonucu
0,000000001, 100000000,0'a eşittir. İptal hatalarını önlemek ve
Daha doğru sonuçlar elde etmek için hesaplama sırasını dikkatli bir şekilde seçin. Örneğin,
Aşağıdaki seriyi hesaplayarak daha doğru sonuçlar elde edersiniz.
soldan sağa değil, sağdan sola:
1 + 1 / 2 + 1 / 3 + ... + 1 / n
Öncekilerin toplamının sonuçlarını karşılaştıran bir program yazınız.
seri, soldan sağa ve sağdan sola n = 50000 ile hesaplanıyor.
*/
public class Question_05_23_İptalHatalarınıGösterin {

    public static void main(String[] args) {
    // Compute series from left to right
    double sumLeftToRight = 0.0;
    for (double i = 1.0; i <= 50000.0; i++) {
        sumLeftToRight += 1 / i;
    }

    // Display result of series sum from left to right
    System.out.println("Summation of series left to right: " + sumLeftToRight);

    // Compute series from right to left
    double sumRightToLeft = 0.0;
    for (double i = 50000.0; i >= 1.0; i--) {
        sumRightToLeft += 1 / i;
    }

    // Display result of series sum from right to left
    System.out.println("Summation of series right to left: " + sumRightToLeft);

    // Compare the results
    System.out.println("Summation of the series right to left - "
            + "Summation of the series left to right: "
            + (sumRightToLeft - sumLeftToRight));
}
}
    //*Summation of series left to right: 11.397003949278504
//Summation of series right to left: 11.397003949278519
//Summation of the series right to left - Summation of the series left to right: 1.4210854715202004E-14*/