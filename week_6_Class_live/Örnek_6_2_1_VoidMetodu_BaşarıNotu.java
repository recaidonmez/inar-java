package week_6_Class_live;

public class Örnek_6_2_1_VoidMetodu_BaşarıNotu {

    public static void main (String[] args){
        System.out.print("notu  ");
        notuGöster(78.5);

        System.out.print("notu  ");
        notuGöster(59.5);
    }
    public static void notuGöster(double puan){
        if(puan>90){
            System.out.println("A");
            }else if(puan>80){
            System.out.println("B");
            }else if(puan>70) {
            System.out.println("C");
            }else if(puan>60) {
            System.out.println("D");
            }else{
            System.out.println("F");
                    }
                }


}
