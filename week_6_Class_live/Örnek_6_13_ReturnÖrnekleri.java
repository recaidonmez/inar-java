package week_6_Class_live;

public class Örnek_6_13_ReturnÖrnekleri {
    public static void main(String[] args) {
        int toplam= onSayınınToplamı();
        System.out.println("10 rastgele sayının toplamı-->" + toplam);
    }

    public static int onSayınınToplamı() {
        int toplam = 0;
        for (int i = 0; i < 10; i++) {
            int sayı = (int) (Math.random() * 100);
            System.out.println((i + 1) +  "  --->  " + sayı);
            if(sayı > 70 && sayı > 80){
                System.out.println("toplam on tane sayı toplanmadı");
                return toplam; // bu şartı görünce işlem bitti.(break bu işi görmez)
            }

            toplam += sayı;
        }

        return toplam;
    }
}