package week_6_Class_live;

public class Örnek_6_1_1_BasitMetod {

    public static void main(String[] args ) {
        System.out.println("1 ile 10 toplamı " + toplama(1, 10));
        System.out.println("20 ile 37 arası toplamı "+ toplama(20,37));
        System.out.println("34 ile 49 arası toplamı "+ toplama(35,49));
    }
        public static int toplama(int n1, int n2){
            int sonuç=0;

            for(int i =n1;i <=n2; i++){
                sonuç +=i;
            }
            return sonuç;
    }

    }






