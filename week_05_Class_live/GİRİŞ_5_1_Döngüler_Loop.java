package week_05_Class_live;

public class GİRİŞ_5_1_Döngüler_Loop {
    public static void main(String[] args){

        int sayaç =0;
            //1000 kez görüntülemeniz gereken durumu düşünü

        while (sayaç<3){  //1000
            System.out.println("Merhaba Dünya");
            sayaç++;
        }


        int toplam =0;
        int i = 1;
        while (i < 20) {    // 20 ye kadar olan rakamı toplar 20 toplamaz.
            toplam = toplam + i;
            i++;
        }
        System.out.println("Toplam  " + toplam); // toplam 190


    }

}
