package Week_6_Assigmets;

/*Mersenne sayıları, matematikte ikinin kuvvetlerinin bir eksiği şeklinde olan sayılardır ve n doğal sayısı için
 Mn = 2^n - 1 şeklinde hesaplanır1. Marin Mersenne adlı Fransız matematikçi, filozof, keşiş ve müzik teorisyeni bu sayılar üzerinde çalışmıştır1.
  Mersenne asal sayıları ise hem bir Mersenne sayısı, hem de asal sayı olan sayılardır. Yani n sayısı için Mn = 2^n - 1 işleminin sonucu
 bir asal sayı ise bu sayıya Mersenne asal sayısı denir1. İlk Mersenne asal sayısı 3’tür. Sonra 7, 31 ve 127 diye devam eder1*/
public class Question_06_28_MersenneAsalSayılar {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s\n", "p", "2^p-1");
        System.out.println("----------------------------------");

        for (int i = 2; i <= 31; i++) {
            if (mersennelSayıyıGöster(i)) {
                System.out.printf("%-15d%-15d\n", i, (int) (Math.pow(2, i) - 1));
            }
        }
    }

    public static boolean mersennelSayıyıGöster(int sayı) {

        return asal(sayı) && asal((int) (Math.pow(2, sayı) - 1));
    }

    public static boolean asal(int sayı) {
        for (int i = 2; i <= sayı / 2; i++) {
            if (sayı % i == 0) {
                return false;
            }
        }

        return true;
    }

}
//*p              2^p-1
//----------------------------------
//2              3
//3              7
//5              31
//7              127
//13             8191
//17             131071
//19             524287
//31             2147483647     */