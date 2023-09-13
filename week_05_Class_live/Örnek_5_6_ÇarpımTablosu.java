package week_05_Class_live;

public class Örnek_5_6_ÇarpımTablosu {
    public static void main(String[] args) {

        System.out.println("           Çarpım Tablosu ");

        System.out.print("      ");//baştaki boşluk

        for (int i = 1; i <= 9; i++) { //yana giden 1-9
            System.out.print("   " + i);
        }
        System.out.println();

        for (int i = 0; i < 60; i++) { // rakam altı çizgi hat
            System.out.print("-");
        }
        System.out.println(); // aşağı inen 1-9+|
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "  |  ");

            for(int j=1; j<=9; j++){
                System.out.printf("%4d",i * j); // çarpı * işareti(istersen +- /)
            }
            System.out.println();
        }
    }//
}
