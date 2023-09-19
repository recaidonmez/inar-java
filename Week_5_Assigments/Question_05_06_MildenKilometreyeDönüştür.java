package Week_5_Assigments;

public class Question_05_06_MildenKilometreyeDönüştür {
    public static void main(String[] args) {

        // sabit degerlerii oluştur

        final double KILOMETERS_PER_MILE = 1.609;

        // tablo başlığını ekranda göster
        System.out.println(
                "Mil        Kilometere   |   Kilometere     Mile     ");

        // taploları oluştur ve ekranda göster

        for (int m = 1, k = 20; m <= 10 && k <= 65; m++, k += 5) {

            // m 1 ve k 20 ise m küçükeşit 10 ve k  küçükeşit 65 olana kadar m yı 1, k yı 5 arttır.

            System.out.printf("%-11d%-10.3f", m, (m * KILOMETERS_PER_MILE));
            //ilk % değer mil ikinici %kilometre
            System.out.print("   |   ");

            System.out.printf("%-15d%-6.3f\n", k, (k / KILOMETERS_PER_MILE));

            //
            //Mil        Kilometere   |   Kilometere     Mile
            //1          1,609        |   20             12,430
            //2          3,218        |   25             15,538
            //3          4,827        |   30             18,645
            //4          6,436        |   35             21,753
            //5          8,045        |   40             24,860
            //6          9,654        |   45             27,968
            //7          11,263       |   50             31,075
            //8          12,872       |   55             34,183
            //9          14,481       |   60             37,290
            //10         16,090       |   65             40,398
        }
    }
}

