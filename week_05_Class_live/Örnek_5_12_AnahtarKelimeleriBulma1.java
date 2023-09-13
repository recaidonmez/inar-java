package week_05_Class_live;

public class Örnek_5_12_AnahtarKelimeleriBulma1 {

      public static void main(String[] args) {
          int toplama = 0;
          int numara = 0;

          while (numara < 20) {
              numara++;
              toplama += numara;
              if (toplama >= 100)
                  break;    //Anahtar kelime  :Döngü ifadelerinde, break ve Continue anahtar sözcükleri ekstra kontroller eklemek için kullanılabilir. Bazen ara ve devam
              //kullanılarak programlama daha basit hale getirilebilir .
          }

          System.out.println("Numaralar " + numara);
          System.out.println("Toplam " + toplama);
      }
}
        //Numaralar 14
        //Toplam 105