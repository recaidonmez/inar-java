package week_6_Class_live;

public class Örnek_6_2_3_TestReturnGradeMethod_NotuBulÇık {

     public static void main(String[] args) {
    System.out.print("Notu " + getGrade(1002));
    System.out.print("\nNotu " + getGrade(59.5));
}

    public static char getGrade(double puan) {
         if(puan>100 || puan<0 ){
             System.out.println("Yanlış puan girdin");
         }
        if (puan >= 90.0)
            return 'A';
        else if (puan >= 80.0)
            return 'B';
        else if (puan >= 70.0)
            return 'C';
        else if (puan >= 60.0)
            return 'D';
        else
            return 'F';
    }
}
//Notu C
//Notu F

