package week_3_live_class;

import java.util.Scanner;

public class YarıÇap {

    public static void main(String[] args) {

        //Veri girişi iste.
        Scanner input = new Scanner(System.in);
        System.out.println("Yarı çap gir   ?");
        double yarıÇap = input.nextDouble();

        //Eğer girilen alan 0 san küçük ise hata değilse, sonucu göster.
        if (yarıÇap < 0) {
            System.out.println("Hatalı giriş  !");
        } else {
            double alan = yarıÇap * yarıÇap * 3.14159;

            System.out.println("Alan---> " + alan);


        }

    }

}

