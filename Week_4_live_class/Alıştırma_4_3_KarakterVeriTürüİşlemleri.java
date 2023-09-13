package Week_4_live_class;

public class Alıştırma_4_3_KarakterVeriTürüİşlemleri {
    public static void main(String[] args){


        //char kod = 'a';

        //char ukod   ='\u0041';

        //System.out.println(+kod);
        //System.out.println(+ukod); // Character A's Unicode is 0041




        int b = 65+(int)(Math.random() * 90-65);
        char cb = (char)(b);

        int a = 48+(int)(Math.random() *(57-48));


        System.out.println(cb); // Character A's Unicode is 0041
        System.out.println(a);
    }
}
