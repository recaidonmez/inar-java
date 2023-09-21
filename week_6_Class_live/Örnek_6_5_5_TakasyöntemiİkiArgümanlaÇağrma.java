package week_6_Class_live;

public class Örnek_6_5_5_TakasyöntemiİkiArgümanlaÇağrma {
    public static void main(String[] args){
        int num1    = 1;
        int num2    = 2;
        System.out.println("Takas yöntemimini çağırmadan önce n1-->  " + num1 + "  ve num2 --->  " +num2);

    // takas metodu
    takas(num1,num2);

        System.out.println("Takas yöntemimini çağırmadan sonra n1-->  " + num1 + "  ve num2 --->  " +num2);

}
public static void takas(int n1, int n2){
        System.out.println("\t takas metodu ile");
        System.out.println("\t\t takas öncesi num1 ->  " + n1 +"  ve num2 -->  " + n2);

        //takasla n1 ve n2

    int temp =n1;
    n1 = n2;
    n2 =temp;

    System.out.println("\t\t takastan sonra num1-->  "+n1 +"  ve num2 "+ n2 );




}
}