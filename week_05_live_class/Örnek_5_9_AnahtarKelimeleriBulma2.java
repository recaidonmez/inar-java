package week_05_live_class;

public class Örnek_5_9_AnahtarKelimeleriBulma2 {
            public static void main(String[] args){



                int toplama = 0;
                int numara = 0;

                  while(numara< 20){
                    numara++;

                    if (numara == 10 || numara == 11) {
                        continue;  //Continue anahtar sözcüğü bir döngünün içinde de kullanılabilir. Böyle bir durumla karşılaşıldığında mevcut
                        //yineleme sonlandırılır ve program kontrolü döngü gövdesinin sonuna aktarılır. Başka bir deyişle, Continue
                        //anahtar sözcüğü bir yinelemeden ayrılırken, break anahtar sözcüğü bir döngüden çıkar
                    }
                    toplama += numara;

                    }

                    System.out.println("toplamı " + toplama);
                }
}                       //toplamı 189

