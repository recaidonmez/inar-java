package week_6_Class_live;

public class Örnek_6_11_1_RastgeleKarakterlerOluşturma {

    private static Örnek_6_10RastgeleKarakterlerOluşturma RandomCharacter;

    /**
         * Main method
         */
        public static void main(String[] args) {
            final int NUMBER_OF_CHARS = 175;
            final int CHARS_PER_LINE = 25;

            // 'a' ile 'z' arasındaki rastgele karakterleri yazdır, 25
            //satır başına karakter
            for (int i = 0; i < NUMBER_OF_CHARS; i++) {
                char ch = RandomCharacter.getRandomLowerCaseLetter();
                if ((i + 1) % CHARS_PER_LINE == 0)
                    System.out.println(ch);
                else
                    System.out.print(ch);
            }
        }
    }
