package Week_6_Assigmets;
/*(Telefon tuş takımları) Telefonlar için uluslararası standart harf/sayı eşlemesi
        Programlama Alıştırması 4.15'te gösterilmektedir. Sayı döndüren bir yöntem yazın,
        aşağıdaki gibi büyük harf verilir:
        int getNumber(char büyük harfHarf)
        Kullanıcıdan bir telefon numarasını dize olarak girmesini isteyen bir test programı yazın.
        Giriş numarası harfler içerebilir. Program bir harfi çevirir (büyük harf)
        veya küçük harf) bir rakama dönüştürür ve diğer tüm karakterleri olduğu gibi bırakır.
        */
import java.util.Scanner;

public class Question_06_21_TelefonTuşTakımları {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan telefon numarasını dize olarak girmesini iste
        System.out.print("Kelime girin   ");
        String hr = input.nextLine();
        String sonuç = "";

        for (int i = 0; i < hr.length(); i++) { //Java’da length() fonksiyonu, bir dizi veya String nesnesinin uzunluğunu döndürmek için kullanılır.
            // Dizilerde, length özelliği, dizinin boyutunu döndürürken,
            // String nesnelerinde length() fonksiyonu, String’in karakter sayısını döndürür.
            // Listelerde ise size() fonksiyonu, listenin eleman sayısını döndürür
            char karekter = hr.charAt(i); //Java’da charAt() fonksiyonu, bir String nesnesinin belirtilen konumdaki karakterini döndürmek için kullanılır

            if (Character.isLetter(karekter)) {
                int numara = numaraAl(karekter);
                sonuç+= numara;


            } else {
                sonuç += karekter;
            }
        }
        System.out.println(sonuç);
    }


   // Yöntem getNumber, büyük harf verilen bir sayıyı döndürür
        public static int numaraAl(char büyükHarf) {

        büyükHarf = Character.toUpperCase(büyükHarf);
            // Uluslararası alanda karakterin numara referansını döndür
            // telefonlar için standart harf/sayı eşlemesi
            if (büyükHarf >= 'W')
                return 9;
            else if (büyükHarf >= 'T')
                return 8;
            else if (büyükHarf >= 'P')
                return 7;
            else if (büyükHarf >= 'M')
                return 6;
            else if (büyükHarf >= 'J')
                return 5;
            else if (büyükHarf >= 'G')
                return 4;
            else if (büyükHarf >= 'D')
                return 3;
            else
                return 2;
        }



    }
//Kelime girin   444-1-inar
//444-1-4627

   // Kelime girin   4441inar
        //44414627