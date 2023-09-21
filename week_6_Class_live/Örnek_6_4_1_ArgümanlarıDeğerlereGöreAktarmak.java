package week_6_Class_live;

import java.util.Scanner;

public class Örnek_6_4_1_ArgümanlarıDeğerlereGöreAktarmak {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Mesajı girin");
        String mesaj = input.nextLine();

        System.out.println("Mesaj kaç defa tekrar edilecek");
        int tekrarlamaSayısı =input.nextInt();

        göster(mesaj, tekrarlamaSayısı);

            }
            public static void göster(String mesaj, int tekrarlama){
        for(int i = 0; i<tekrarlama; i++){
            System.out.println((i + 1)+"-->   " + mesaj);
        }
            }
}
/*Mesajı girin
Selam
Mesaj kaç defa tekrar edilecek
5
1-->   Selam
2-->   Selam
3-->   Selam
4-->   Selam
5-->   Selam*/