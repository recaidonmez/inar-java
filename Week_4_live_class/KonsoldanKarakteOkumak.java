package Week_4_live_class;

import java.util.Scanner;

public class KonsoldanKarakteOkumak {
    public static void main(String[] args ){

        Scanner input = new Scanner(System.in);
        System.out.print("Bir karakter girin: ");
        String s = input.nextLine();
        char ch = s.charAt(3);
        System.out.println("Girilen karakter: " + ch);

        //Bir karakter girin: recai
        //Girilen karakter: a

    }
}
