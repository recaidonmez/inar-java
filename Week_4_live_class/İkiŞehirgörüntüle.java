package Week_4_live_class;

import java.util.Scanner;

public class İkiŞehirgörüntüle {

    public static void main(String[] args){

                   Scanner input = new Scanner(System.in);

                 // şehirleri görüntüle
                 System.out.print("Bir şehir girin ");
                 String city1 = input.nextLine();

                 System.out.print("ikinci şehri girin ");
                 String city2 = input.nextLine();

                 //Karşılaştır
                 if (city1.compareTo(city2) < 0)
                 System.out.println("Şehirler alfabetik sıraya göre " +
                 city1 + " " + city2);
                 else
                 System.out.println("Şehirler alfabetik sıraya göre " + city2 + " " + city1);

                        //Bir şehir girin rize
        //ikinci şehri girin bursa
        //Şehirler alfabetik sıraya göre bursa rize



    }
    }

