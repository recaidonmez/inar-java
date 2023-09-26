package week_6_Class_live;

public class Örnek_6_8_1_AşırıYüklemeYöntemleri {
    public static void main(String[] args) {
       // int parametreleriyle max yöntemini çağırıyoruz
        System.out.println("3 ile 4 arasındaki büyük olanı bul ");

        // Invoke the max method with the double parameters
         System.out.println("3 ve 4'ün maksimum değeri  "
                + max(3.0, 5.4));

        // max yöntemini double parametrelerle çağırıyoruz
       System.out.println("3.0 ve 5.4'ün maksimum değeri" + max(3.0, 5.4, 10.14));
         }

        /** aksi
         takdirde sayı2'yi döndürür;*/
         public static int max(int num1, int num2) {
         if (num1 > num2)
            return num1;
        else
         return num2;
       }

         /** Find the max of two double values*/
        public static double max(double num1, double num2) {
        if (num1 > num2)
           return num1;
       else
        return num2;
        }

       /** Return the max of three double values*/
        public static double max(double num1,double num2,double
 num3) {
       return max(max(num1, num2), num3);
       }
}


/*The maximum of 3 and 4 is
3 ve 4'ün maksimum değeris 5.4
3.0 ve 5.4'ün maksimum değeri10.14*/