package week_2_Assigments;

import java.util.Scanner;

public class Question_02_07_YılSayısısnıBulun {

    public static void main(String[] args ) {

        Scanner input =new Scanner(System.in);

        //Dakika girdisi iste

        System.out.println("Lütfen yı hesabı için bir dakika girin");
        long dakika = input.nextLong();

        long saat = dakika /60;

        long gün = saat / 24;

        long yıl = gün /365;

        long kalangün = gün % 365;

        System.out.println(yıl + " yıl " + kalangün + " gün ");

        //Lütfen yı hesabı için bir dakika girin
        //1000000000
        //1902 yıl 214 gün
    }
}
