package Week_5_Assigments;
//ASCII karakter tablosunu görüntüleyin) ASCII'deki karakterleri yazdıran bir program yazın
//karakter tablosu ! ~'e. Satır başına on karakter görüntüler. ASCII tablosu şurada gösterilmiştir:
//Ek B. Karakterler tam olarak bir boşlukla ayrılmıştır.
public class Question_05_15_ASCII_KaraakterTablosu {
    public static void main(String[] args) {
        char karakter;              //ünlem ile dalgalı işaret arası karakterleri bul ve bir arttır
        int başlangıç = '!';
        int bitiş = '~';

        for (int i = başlangıç; i <= bitiş; i++) {
            karakter = (char) i;
            System.out.print(karakter);
            System.out.print(i % 10 == 0 ? "\n" : " "); //i yi 10 luk tablo yap ve alt alta yaz
        }
    }
}

    //
         //(
        //) * + , - . / 0 1 2
        //3 4 5 6 7 8 9 : ; <
        //= > ? @ A B C D E F
        //G H I J K L M N O P
        //Q R S T U V W X Y Z
        //[ \ ] ^ _ ` a b c d
        //e f g h i j k l m n
        //o p q r s t u v w x
        //y z { | } ~