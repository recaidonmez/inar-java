package week_04.live_class;

public class MyString3 {
    public static void main(String[] args) {
        String inarAcademy = "Inar Academy";

        String newString = inarAcademy.substring(3);
        System.out.println(newString);


        newString = inarAcademy.substring(3,8);
        System.out.println(newString);


        // contains

        System.out.println("Does the word contains 'Inar'?\n" + inarAcademy.contains("Inar"));
        System.out.println("Does the word contains 'Academy'?\n" + inarAcademy.contains("Academy"));
        System.out.println("Does the word contains 'tarik'?\n" + inarAcademy.contains("tarik"));

        System.out.println(inarAcademy.startsWith("Inar"));
        System.out.println(inarAcademy.endsWith("my"));

    }
}
