package week_04.live_class;

import java.util.Scanner;

public class MyString1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string:");

//                String word = input.nextLine();
        String word = "inar";

        System.out.print("You have entered :");
        System.out.println(word);

        word = word.trim();
        String deneme = word.toLowerCase();
        deneme = deneme.toUpperCase();

        char firstCharacter = word.charAt(0);
        char thirdCharacter = word.charAt(2);

        System.out.println("***********");
        System.out.println(word == deneme);
        System.out.println("***********");


        String a = new String("inar academy");
        String b = new String("inar academy");
        String c = "inar academy";
        String d = "inar academy";
        d = "inar";
        c = "inar";

        System.out.println("-------");

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(System.identityHashCode(d));

        System.out.println("--------");
        System.out.println("Is a == b ?" + ( a == b));//false
        System.out.println("Is c == b ?" + ( c == b));//false
        System.out.println("Is c == d ?" + ( c == d));//true
        System.out.println("-----------");

        System.out.println("Is a equal b ?" + ( a.equals(b)));//true
        System.out.println("Is c equal b ?" + ( c.equals(b)));//true
        System.out.println("Is c equal d ?" + ( c.equals(d)));//true

        System.out.println("-----------");


        //equals vs equal Ignore case
        String word2 = "inar Academy";
        String word3 = "Inar Academy";
        System.out.println("Are those equal?" + word2.equals(word3));
        System.out.println("Are those equal if casing ignored?" + word2.equalsIgnoreCase(word3));


        System.out.println("+++++++++++");
        word2 = "aaasdfaeweetqwetqewrtqewrtqwet";
        word3 = "axasdfaesfaewsfeaw";
        System.out.println(word2.compareTo(word3));

        System.out.println("+++++++++++");






        int l = word.length();
        System.out.println("the length is " + l);

        char lastLetterOfWord = word.charAt( (word.length()) -1 );
        System.out.println("The last letter of the given word is " + lastLetterOfWord);

//        System.out.println("The first character of your string is " + firstCharacter);

        System.out.println("-------");
        String empty = "01234";
        System.out.println(empty.charAt(3));
//        System.out.println(empty.charAt(9));
        System.out.println(empty.length());

    }
}
