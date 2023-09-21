package week_6_Class_live;

import java.util.Scanner;

public class Örnek_6_11_1_TakvimYazdır {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("yıl gir");
        int yıl = input.nextInt();

        System.out.println("ay gir");
        int ay = input.nextInt();

        ayıGöster(yıl, ay);
    }

    public static void ayıGöster(int yıl, int ay) {
        ayınBaşlığınıGöster(yıl, ay);
        ayıEşinigöster(yıl, ay);
    }

    public static void ayınBaşlığınıGöster(int yıl, int ay) {
        String ayAdı = ayAdıİste(ay);
        System.out.println("       " + ayAdı + ", " + yıl);
        System.out.println("----------------------------------");
        System.out.println("paz pzt sal çar per cum cmt ");
    }

    public static String ayAdıİste(int ay) {
        String sonuç = "";
        switch (ay) {
            case 1:
                sonuç = "ocak";
                break;
            case 2:
                sonuç = "şubat";
                break;
            case 3:
                sonuç = "mart";
                break;
            case 4:
                sonuç = "nisan";
                break;
            case 5:
                sonuç = "mayıs";
                break;
            case 6:
                sonuç = "haziran";
                break;
            case 7:
                sonuç = "temmuz";
                break;
            case 8:
                sonuç = "ağustos";
                break;
            case 9:
                sonuç = "eylül";
                break;
            case 10:
                sonuç = "ekim";
                break;
            case 11:
                sonuç = "kasım";
                break;
            case 12:
                sonuç = "aralık";
                break;

        }
        return sonuç;
    }

    public static void ayıEşinigöster(int yıl, int ay) {
        int ayınBaşlangıçGünü = ayınBaşlangıçGünüGöster(yıl, ay);
        int ayınGünleri = ayınGünleriniGöster(yıl, ay);

        for(int i = 0; i<ayınBaşlangıçGünü; i++){
            System.out.print("");
        }
        for(int i = 0; i<=ayınGünleri; i++){
            ayınBaşlangıçGünü++;
            System.out.printf("%-4d", i);
            if(ayınBaşlangıçGünü % 7 == 0){
                System.out.println();

            }
        }
    }
     public static  int ayınGünleriniGöster(int yıl,int ay){

    if(ay==1 || ay ==3|| ay == 5|| ay ==7|| ay == 8|| ay ==10 ||ay ==12){
        return 31;
    } else if(ay == 4 || ay ==6 || ay ==9 || ay==11){
        return 30;
    }else{
        if(artıkYıl(yıl)){
            return 29;
        }else{
            return 28;
        }
    }
}
public static  boolean artıkYıl(int yıl){

        return((yıl % 4 == 0 && yıl % 100 != 0) || (yıl % 400 == 0));
    }
    public static int ayınBaşlangıçGünüGöster(int yıl, int ay){
        final int ŞUBAT_AYI_İLK_GÜNÜ_BAŞLANGIÇ_1800 = 3;
        int yılındanBuyanaTolamGün_1800 = toplamGünüAl(yıl, ay);
        return (yılındanBuyanaTolamGün_1800 = ŞUBAT_AYI_İLK_GÜNÜ_BAŞLANGIÇ_1800) % 7;

    }
public static int toplamGünüAl(int yıl, int ay){
        int toplamGün = 0;
        for(int i = 1800; i < yıl; i++){
            if(artıkYıl(i)){
                toplamGün += 366;
            }else{
                toplamGün = 365;
            }
        }
    // ayın günleri

    for(int i = 1; i<ay; i++) {
        toplamGün += ayınGünleriniGöster(yıl, i);

    }
return toplamGün;
}
}