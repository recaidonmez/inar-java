package week_05_live_class;

import java.util.Scanner;

public class örnek_5_10_Polindrom { //=hem baştan hem de tersten aynı okunan bir kelimedir
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kelime iste
        System.out.print("kelime girin: ");
        String s = input.nextLine();

        // / Dizedeki ilk karakterin dizini
        int ilk = 0;

        // / Stringin son karakterinin indeksi
        int son = s.length() - 1;

        boolean palidromdur = true;
        while (ilk < son) {

            if (s.charAt(ilk) != s.charAt(son)) {
                int factor = 2;

                palidromdur = false;
                break;
            }

            ilk++;
            son--;
        }

        if (palidromdur)
            System.out.println(s + " palidromdur");
        else
            System.out.println(s + " palidromdur değildir.");
    }
}

