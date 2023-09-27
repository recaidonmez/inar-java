package week_04.live_class;

public class MyChar {
    public static void main(String[] args) {
        char letter = 'a';
        System.out.println((int) letter);
        System.out.println((char) 100);

        // password
        // lowercase        => (97-122) 'a' <= letter <= 'z'
        // uppercase        => (65-90)
        // lenght = 8       => constant
        // special character=> (33-47)
        // integer          => (48 -57)

        char number1 = '1';
        System.out.println((int) number1);
        String ozgur = "Ozgur";


        System.out.println("-----------------");

        char character = 's';
        System.out.println(character);
        System.out.println(++character);
        System.out.println(++character);

        System.out.println("-----------------");

        char escape = '\n';

        System.out.println((escape));
        System.out.println((int) escape);

        char ch = (char) Math.round(65.95);
        System.out.println(ch);


        System.out.println("-----------------");

        System.out.println(Character.isDigit('t'));
        System.out.println("Is A lower case " + Character.isLowerCase('A'));
        System.out.println("Convert i to uppercase :" + Character.toUpperCase('i'));
        System.out.println("I am converting i to uppercase :" + (char) ('i' - 32));
        System.out.println("Convert 5 to uppercase :" + Character.toUpperCase('5'));
        System.out.println("Is 7 a digit :" + (Character.isDigit('7') ? "Yes" : "No"));
        System.out.println("Is t a digit :" + (Character.isDigit('t') ? "Yes" : "No"));
        System.out.println("Is a smaller than b? " + ('a' < 'b'));
        System.out.println();
        System.out.println();

    }
}
