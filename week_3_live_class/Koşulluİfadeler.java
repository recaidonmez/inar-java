package week_3_live_class;

import java.util.Scanner;

public class Koşulluİfadeler {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("rakam gir");
        int x = input.nextInt();
        int y;
        //
        //        if (x > 0 )
        //            y = 1;
        //
        //        else
        //            y=-1;

        // YADA en kısa şekli

        y = (x > 0) ? 1 : -1;

        System.out.println(" y nin değeri  " + y);

        //rakam gir
        //6
        // y nin değeri  1

        //rakam gir
        //-215
        // y nin değeri  -1
    }
}
