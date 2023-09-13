package week_3_Assigments;

import java.util.Scanner;

public class Question_03_24_KartÇekmeOyunu {
    public static void main(String[] args ) {

        Scanner input = new Scanner(System.in);

        int numara1 =(int)(Math.random()*13);
        int numara2 =(int)(Math.random()*4);

        System.out.println("Şeçtiğin kart");

        switch (numara1) {
            case 0:
                System.out.println("As");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                System.out.println("7");
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;
            case 10:
                System.out.println("Vale");
                break;
            case 11:
                System.out.println("Kız");
                break;
            case 13:
                System.out.println("Papaz");
        }

            System.out.println(" ile");

        switch (numara2) {
            case 0 : System.out.println("Sinek");break;
            case 1 : System.out.println("Karo");break;
            case 2 : System.out.println("Kupa");break;
            case 3 : System.out.println("Maça");

        }
    }
}
    //Şeçtiğin kart
//Kız
// ile
//Kupa