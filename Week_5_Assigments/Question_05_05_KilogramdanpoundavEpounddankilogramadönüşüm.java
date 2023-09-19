package Week_5_Assigments;

public class Question_05_05_KilogramdanpoundavEpounddankilogramadönüşüm {
    public static void main(String[] args) {

        final double POUND_PER_KG = 2.2;

        System.out.println("Kilogram    Pound    |    Pound       Kilogram");

        for (int k = 1, p = 20; k <= 199 && p <= 515; k += 2, p += 5) {

            // k 1 den p 20 den başlayıp  k 199 p de 515 olana kadar k yı 2 arttır p yise 5 arttırarak hesapla

            System.out.printf("%-12d%7.1f", k, (k * POUND_PER_KG)); // saga doğru -12 boşluk. virğülden sonnra ise 1 rakam

            System.out.print("    |    "); //   | işareti olmayıp ln olsaydı alta alta yazardı.

            System.out.printf("%-10d%12.2f\n", p, (p / POUND_PER_KG));
        }
    }
}
                //189           415,8    |    490             222,73
                //191           420,2    |    495             225,00
                //193           424,6    |    500             227,27
                //195           429,0    |    505             229,55
                //197           433,4    |    510             231,82
                //199           437,8    |    515             234,09


