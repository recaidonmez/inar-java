package week_05_live_class;

import java.util.Scanner;

public class Örnek_5_2_YaklaşanNumaraTahmini {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numara = (int) (Math.random() * 100);

        System.out.print("tahmin girin\n");
        int tahmin = input.nextInt();

        while (tahmin != numara) {
            System.out.print("\ntekrar tahmin girin\n");
                 tahmin = input.nextInt();
            if (tahmin == numara)
                System.out.println("doğru bildin    " + numara);
            else if (tahmin > numara)
                System.out.println("uzak tahmin");
            else
                System.out.println("yakın tahmin");
        }
    }
}
