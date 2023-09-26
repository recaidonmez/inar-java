package week_6_Class_live;

import java.util.Scanner;

// cümlenin ilk kelimesinin kaç defa yazdırılması
public class Örnek_16_14_DersteSoruÇözümü {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("kelime girin");
        String kelime = input.nextLine();

        System.out.println("kaç defa yazdırılacak");
        int yazdırmaSayısı = input.nextInt();

        kelimeyiGöster(kelime, yazdırmaSayısı);

    }

    public static void kelimeyiGöster(String kelime, int yazdırmaSayısı) {

        String yeniKelime = "";

        if (kelime.contains(" ")) { // "" aralarına boşluk koymayı unutma
            yeniKelime = kelime.substring(0, kelime.indexOf(' '));

        } else {
            yeniKelime = kelime;
        }

        for (int i = 1; i <= yazdırmaSayısı; i++) {
            System.out.println(yeniKelime);
        }
    }
}
