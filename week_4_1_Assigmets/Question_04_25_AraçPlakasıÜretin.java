package week_4_1_Assigmets;

public class Question_04_25_AraçPlakasıÜretin {
    public static void main(String[] args){

        int plakaHarfi1 =65+(int)(Math.random()*(91-65));        //ASCI tablosunun büyük harf aralığı.
        int plakaHarfi2 =65+(int)(Math.random()*(91-65));
        int plakaHarfi3 =65+(int)(Math.random()*(91-65));

        char plakaChar1 = (char)(plakaHarfi1);
        char plakaChar2 = (char)(plakaHarfi2);
        char plakaChar3 = (char)(plakaHarfi3);

        int plakaSayısı1 = (int)(Math.random()*10);
        int plakaSayısı2 = (int)(Math.random()*10);
        int plakaSayısı3 = (int)(Math.random()*10);
        int plakaSayısı4 = (int)(Math.random()*10);

        System.out.println("Oluşturulan plaka numarası\n" + plakaChar1 + plakaChar2 + plakaChar3 +plakaSayısı1 + plakaSayısı2 + plakaSayısı3 + plakaSayısı4 ) ;


        //Oluşturulan plaka numarası
        //MIG4699
    }
}
