package week_6_Class_live;

public class Örnek_6_10RastgeleKarakterlerOluşturma {
    public static char getRandomCharacter(char ch1,char ch2){
         return (char)(ch1 + Math.random() * (ch2 - ch1+ 1));
         }
         /** * Kanal1 ve Kanal2 arasında rastgele bir karakter oluşturun */
         public static char getRandomLowerCaseLetter() {
         return getRandomCharacter('a', 'z');
         }

         /** * Rastgele bir küçük harf üret */
        public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
         }

        /** Rastgele rakamlı bir karakter oluşturun */
         public static char getRandomDigitCharacter() {
         return getRandomCharacter('0', '9');
         }

        /** * Rastgele bir karakter üret */
        public static char getRandomCharacter() {
       return getRandomCharacter('\u0000', '\uFFFF');
       }

}
