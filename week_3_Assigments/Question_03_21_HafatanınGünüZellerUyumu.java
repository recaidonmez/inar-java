package week_3_Assigments;

import java.util.Scanner;

public class Question_03_21_HafatanınGünüZellerUyumu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yılı, ayı ve ayın gününü girmesini isteyin..
        System.out.print("Yıl gir: (örnek., 2012): ");
        int yıl = input.nextInt();
        System.out.print("Ay gir: 1-12: ");
        int ay = input.nextInt();
        System.out.print("Ayın gününü girin: 1-31: ");
        int ayınGünü = input.nextInt();

        //  Ocak ve Şubat aylarını önceki yılın 13 ve 14. aylarına dönüştürün

        if (ay == 1 || ay == 2) {

            ay = (ay == 1) ? 13 : 14;
            yıl--;
        }
        // // Haftanın gününü hesapla
        {
            int haftanıngünü = (ayınGünü + (26 * (ay + 1)) / 10 + (yıl % 100)
                    + (yıl % 100) / 4 + (yıl / 100) / 4 + 5 * (yıl / 100)) % 7;


            //ekranda göster
            System.out.print(" Haftanın gününü ");
            switch (haftanıngünü) {
                case 0:
                    System.out.println("Cumartesi");
                    break;
                case 1:
                    System.out.println("Pazar");
                    break;
                case 2:
                    System.out.println("Pazartesi");
                    break;
                case 3:
                    System.out.println("Sali");
                    break;
                case 4:
                    System.out.println("Çarşamba");
                    break;
                case 5:
                    System.out.println("Perşembe");
                    break;
                case 6:
                    System.out.println("Cuma");

                    }
            }
        }
    }
    //Yıl gir: (örnek., 2012): 2015
//Ay gir: 1-12: 1
//Ayın gününü girin: 1-31: 25
// Haftanın gününü Pazar

//Yıl gir: (örnek., 2012): 2012
//Ay gir: 1-12: 5
//Ayın gününü girin: 1-31: 12
// Haftanın gününü Cumartesi


