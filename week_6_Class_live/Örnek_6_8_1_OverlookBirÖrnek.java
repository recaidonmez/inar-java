package week_6_Class_live;
    // formüller dikkat ikiside aynı değerşler farklı int double
public class Örnek_6_8_1_OverlookBirÖrnek {
    public static void main(String [] args) {
        int n1 = 5;
        int n2 = 8;
        int intBüyükOlan = max(n1,n2);

        System.out.println("intbüyük olan---->" + intBüyükOlan);

        double num1 = 5.19;
        double num2 = 2.25454;
        double doubleBüyükOlan= max(num1,num2);

        System.out.println("doublebüyük olan---->" + doubleBüyükOlan);
    }

    public static int max (int n1, int n2){
        return n1 > n2 ? n1:n2;     /**/
    }
    public static double max(double n1, double n2){
        return n1 > n2 ? n1 : n2;
    }
}
