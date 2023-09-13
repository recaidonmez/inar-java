package Week_4_live_class;

import java.util.Scanner;

public class EnYakınSporSalonuAbs {
    public static void main(String[] args ){

        Scanner input =new Scanner(System.in);

        int min, mid, max;

        System.out.println( "üç tane uzaklık girin :");

        int gym1 = input.nextInt();
        int gym2 = input.nextInt();
        int gym3 = input.nextInt();

        int mesafegym1 = Math.abs(gym1);           //ABS :int x = -5;
                                                 // int y = Math.abs(x);   y şimdi 5 değerini alır - değeri + yapar.
        int mesafegym2 = Math.abs(gym2);
        int mesafegym3 = Math.abs(gym3);

        int tempMin = Math.min(mesafegym1, mesafegym2);
        min = Math.min(tempMin,mesafegym3);

        if (min == mesafegym1) {
            System.out.printf("En yakın GYM  gym1 %d\n", gym1);
        } else if (min == mesafegym2) {
            System.out.printf("En yakın GYM gym2 %d\n", gym2);
        } else {
            System.out.printf("En yakın GYM gym3 %d\n", gym3);
        }







    }
}
