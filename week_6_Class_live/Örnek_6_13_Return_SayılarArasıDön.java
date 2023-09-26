package week_6_Class_live;

public class Örnek_6_13_Return_SayılarArasıDön{
public static void main(String [] args) {
    int sayaç1 = 0;
    int sayaç2 = 0;
    int sayaç3 = 0;

        for(int i=0; i < 100; i++){
            int sonuç =rastGeleSayıyıGöster();


    switch (sonuç) {
        case 0:
            System.out.println("sayı 0 ile 33  arasında");
            sayaç1++;
            break;
        case 1:
            System.out.println("sayı 34 ile 66 arsında");
            sayaç2++;
            break;
        case 2:
            System.out.println("sayı 67 ile 100 arasında");
            sayaç3++;
            break;
    }
    }
    System.out.println("sayaç1---->  " + sayaç1);
    System.out.println("sayaç2---->  " + sayaç2);
    System.out.println("sayaç3---->  " + sayaç3);
    }
 public static int rastGeleSayıyıGöster() {

        int sayı = (int) (Math.random() * 100);
        System.out.println(sayı);
        if (sayı <= 33) {
            return 0;
        } else if (sayı <= 66) {
            return 1;
        } else {
            return 2;

        }

    }
}


