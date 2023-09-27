package week_05_live_class;

public class Örnek_5_6_İçİçeDöngüler {
    public static void main (String[] args) {

        int sayaç = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Satır :" + i);

            for (int j = 10; j >= 0; j--) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
