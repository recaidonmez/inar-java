package Week_5_Assigments;
        //Kilogramdan pounda dönüşümü
public class Question_05_03_KilogramdanPpoundaDönüşümü {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2;    // Sabiti oluştur

        // ekranda tablo başlığını göster
        System.out.println("Kilogram      Pound");

        // Display table
        for (int i = 1; i <= 199; i += 2) {
            System.out.printf(
                    "%-15d%6.1f\n", i, (i * POUNDS_PER_KILOGRAM));

            //---------------
            //185             407,0
            //187             411,4
            //189             415,8
            //191             420,2
            //193             424,6
            //195             429,0
            //197             433,4
            //199             437,8
        }
    }
}

