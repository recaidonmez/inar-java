package week_6_Class_live;

public class Örnek_6_7_AsalSayılarıBulma {
    public static void main(String[] args) {
         System.out.println("İlk 50 asal sayı\n");
         asalSayılarıYazdır(50);
         }

       public static void asalSayılarıYazdır(int asalSayımı){
         final int asalSayıSatırı=10; // satır başına int sayısı
         int sayaç = 0; // satır başına int sayısı
         int numara = 2; //  Asallık açısından test edilecek bir sayı

        // Asal sayıları tekrar tekrar bulun
        while (sayaç < asalSayımı) {
        // Asal sayıyı yazdırın ve sayıyı artırın
          if (asalSayı(numara)) {
             sayaç++; // / Sayıyı arttır


                 if (sayaç % asalSayıSatırı == 0) {
                   // P/ Numarayı yazdırıp yeni satıra geçiyoruz
                     System.out.printf("%-5s\n", numara);
                     }
                else
                 System.out.printf("%-5s",numara);
                 }

             // Check whether the next number is prime
             numara++;
            }
         }

        /** Check whether number is prime */
         public static boolean asalSayı(int number) {
         for(int bölen = 2; bölen <= number / 2;bölen++){
             if(number % bölen==0){///Eğer doğruysa sayı asal değil

                 return false; // Number is not a prime
                 }
          }
         return true; // / Sayı asaldır
        }
 }

 //İlk 50 asal sayı
//
//2    3    5    7    11   13   17   19   23   29
//31   37   41   43   47   53   59   61   67   71
//73   79   83   89   97   101  103  107  109  113
//127  131  137  139  149  151  157  163  167  173
//179  181  191  193  197  199  211  223  227  229

/*lmadığını doğrulamak ve asal sayıları görüntülemek. Sonuç olarak, revize edilen program daha
okunabilir ve hata ayıklaması daha kolaydır. Ayrıca, printPrimeNumbers ve
isPrime yöntemleri artık diğer programlarda yeniden kullanılabilir.*/