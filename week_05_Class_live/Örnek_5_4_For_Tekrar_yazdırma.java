package week_05_Class_live;

public class Örnek_5_4_For_Tekrar_yazdırma {
    public static void main(String[] args) {

        int sayaç = 0;
        //1000 kez görüntülemeniz gereken durumu düşünü

        while (sayaç < 10) {  //1000
            System.out.println(sayaç);
            sayaç++;
        }
        do {
            System.out.println(sayaç);
            sayaç++;
        } while (sayaç < 10);

        for (int i = 0; i < 10; i++) ;{

        System.out.println(sayaç);
    }
    }
}
