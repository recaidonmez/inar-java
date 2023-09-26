package week_6_Class_live;

import java.util.Scanner;

public class Örnek_6_12_Mesaj_Gir_Kaçdefa_yazdır {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir mesaj gir");
        String mesaj = input.nextLine();

        System.out.println("Mesajın kaç defa yazılsın");
        int mesajSayısı = input.nextInt();

        mesajSayısınıGöster(mesaj, mesajSayısı);

    }

    public static void mesajSayısınıGöster(String msj, int msjs){
    for(int i = 1; i <= msjs; i++){
        System.out.println( i +" ---->  " + msj );

        if(i == 7){ //mesaj 7 defa yazılınca biter fazlasını yazmaz
            System.out.println("Bu senin son mesajın,en fazla 7 defa yazılır.");
            return;
        }
        }



}

}