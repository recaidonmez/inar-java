package week_3_Assigments;

import java.util.Scanner;

public class Question_03_22_DaireyİçiİkiNokta {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nİki kordinatlı nota girin: ");
        double x2 = in.nextInt();
        double y2 = in.nextInt();

        double x1 = 0;
        double y1 = 0;

        double sıfırNoktası = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        String res = "";
        if (sıfırNoktası <= 10) {
            res += "Çemberin içinde";
        } else {
            res += "Çemberin dışında";
        }
        System.out.println("Point (" + x2 + ", " + y2 + ") " + res);


    }
}
        //İki kordinatlı nota girin: 4
//5
//Point (4.0, 5.0) Çemberin içinde

//İki kordinatlı nota girin: 9
//9
//Point (9.0, 9.0) Çemberin dışında