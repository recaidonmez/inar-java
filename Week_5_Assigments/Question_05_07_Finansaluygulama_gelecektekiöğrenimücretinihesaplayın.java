package Week_5_Assigments;
        //(Finansal uygulama: gelecekteki öğrenim ücretini hesaplayın) Bir üniversitenin öğrenim ücretinin bu yıl
        //10.000 $ olduğunu ve her yıl %5 arttığını varsayalım. Bir yıl içinde öğrenim ücreti 10.500 dolar olacak.
        //Çıktı :
        //(En yüksek puanı bulun) Kullanıcıdan öğrenci sayısını ve her öğrencinin adını ve
        //puanını girmesini isteyen ve sonunda en yüksek puana sahip öğrencinin adını görüntüleyen bir
        //program yazın.
        //On yıllık öğrenim ücretini ve onuncu yıldan sonraki dört yıllık öğrenim ücretinin toplam
        //maliyetini hesaplayan bir program yazınız.
public class Question_05_07_Finansaluygulama_gelecektekiöğrenimücretinihesaplayın {
    public static void main(String[] args) {
        int toplamMaliyet = 0;        // 4 yıllık eğitim maliyetini topla
        int öğrenimÜcreti = 10000;
        int onYılsonraÜcret = 0;

        for (int yıl = 1; yıl <= 14; yıl++) {   //her yıl 0,05 arttır ve 14 yılda dur.
            // öğrenim ücretini her yıl %5 arttır
            öğrenimÜcreti += (öğrenimÜcreti * 0.05);

            // 10 yıl sonrasını test et
            if (yıl > 10) { // 10 yıla geldiğinde toplam maliyatei göster
                toplamMaliyet += öğrenimÜcreti; // öğrenim üçretini topla

            }

            // on yıllık öğrenim ücreti
            if (yıl == 10) {
                onYılsonraÜcret = öğrenimÜcreti;
            }
        }

        // 10 yıllık öğrenim ücreti
        System.out.println("10 yıllık öğrenim ücreti:" + onYılsonraÜcret + " TL");

        // Onuncu yıldan sonraki dört yıllık eğitimin maliyetini görüntüle
        System.out.println("Onuncu yıldan sonra,\nDört yıllık öğrenim ücretinin toplam maliyeti  :" +
                  + toplamMaliyet + " TL");
    }
}       //
            //10 yıllık öğrenim ücreti:16284 TL
            //Onuncu yıldan sonra,
            //Dört yıllık öğrenim ücretinin toplam maliyeti  :73690 TL


