package week_3_live_class;

import java.util.Scanner;

public class ArtıkYılınBelirlenmesi {
    public static void main(String[] args){

        Scanner input =new Scanner(System.in);

        System.out.println("Bir yıl giriniz  ");

        int yıl =input.nextInt();


        // Yılın artık yıl olup olmadığını kontrol edin
        boolean artıkyıl = (yıl % 4 == 0 && yıl % 100 !=0) || (yıl % 400 == 0);

        // Sonucu göster

        System.out.println(yıl +" Artık yıl mı? " + artıkyıl);

        //Bir yıl giriniz
        //2002
        //2002 Artık yıl mı? false
        //
        //Process finished with exit code 0

    }
}
