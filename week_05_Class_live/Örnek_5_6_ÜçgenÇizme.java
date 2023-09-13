package week_05_Class_live;

public class Örnek_5_6_ÜçgenÇizme {
    public static void main (String[] args) {

        int sayaç = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Satır :" + i);

            for (int j = 10; j > i; j--) {
                System.out.print(" * ");

            }

            System.out.println();
        }
    }
}