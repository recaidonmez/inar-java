package week_6_Class_live;

public class Örnek_6_1_3_StackOverFlow_ToplaÇarparakİkiKatınıAl {
    public static void main(String[] args) {

        int toplama = addThenMultiply(3, 5);
        System.out.println("toplam =" + toplama);
    }

    public static int addThenMultiply(int numara1, int numara2) {
        int sonuç = numara1 + numara2;
        sonuç = çarpmarakİkiKatınıAlma(sonuç, 2);
        return sonuç;
    }

    public static int çarpmarakİkiKatınıAlma(int numara1, int numara2) {
        int sonuç = numara1 * numara2;
        return sonuç;
    }
}