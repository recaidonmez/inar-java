package Week_5_Assigments;
    //Matematik: kombinasyonlar) 1'den 7'ye kadar olan tamsayılardan iki sayı seçmek için olası tüm
    //kombinasyonları görüntüleyen bir program yazın. Ayrıca tüm kombinasyonların toplam sayısını da görüntüleyin.
public class Question_05_43 {
    public static void main(String[] args) {
    int sayaç = 0; // Kombinasyon sayısını sayar

        // Olası tüm kombinasyonları göster
        // 1'den 7'ye kadar tamsayılar arasından seçim yapıyoruz

    for (int number1 = 1; number1 < 7; number1++) {
        for (int number2 = number1 + 1; number2 <= 7; number2++) {
            System.out.println(number1 + " " + number2);
            sayaç++; // Increment count
        }
    }

        // Tüm kombinasyonların toplam sayısını göster
    System.out.println("Tüm kombinasyonların toplam sayısı " + sayaç);
}
}
