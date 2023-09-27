package week_04.live_class;

public class MyString {
    public static void main(String[] args) {
        String name = "          Inar Academy   ";
        int length = name.length();
        System.out.printf("The character length of %s is %d\n", name, length);

        int thirdLetterOfName = name.charAt(5);
        System.out.println((char) thirdLetterOfName);
        System.out.println(name.indexOf('c'));
        System.out.println("The last index of a is " + name.lastIndexOf('a'));

        String firstWords = "I Love ";
        String sentence = firstWords + name;
        String newSentence = firstWords.concat(name);
        System.out.println(sentence);
        System.out.println(" The new sentence is : " + newSentence);

        System.out.println("Uppercase : " + newSentence.toUpperCase());
        System.out.println("LowerCase : " + newSentence.toLowerCase());

        System.out.println("Original :" + name + "\nLenght is " + name.length());
        System.out.println("Trimmed  :" + name.trim() + "\nLenght is " + name.trim().length());
    }
}
