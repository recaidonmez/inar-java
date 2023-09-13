package week_05_Class_live;

public class Örnek_5_8_VakaÇalışmasıGelecektekiÖğrenimÜcretiniTahminEtmek {

    public static void main(String[] args) {

        double öğrenimÜcreti = 10000;
        int yılsayacı   = 0;

        while(öğrenimÜcreti<20000){

            öğrenimÜcreti *=1.07;  // tuition = tuition * 1.07;
            yılsayacı++;
        }
        System.out.println( yılsayacı+"yılda öğrenim ücreti iki katına çıkacak ");
        System.out.printf("öğrenim ücretide TL%.3f için %1d yılda ", öğrenimÜcreti, yılsayacı);

    }
}
