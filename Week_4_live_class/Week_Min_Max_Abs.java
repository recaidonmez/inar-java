package Week_4_live_class;

import java.util.Scanner;

public class Week_Min_Max_Abs {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int min, mid, max;


        int nam1 = 8;
        int nam2 = 12;
        int nam3 = 5
                ;

        int tempMax = Math.max(nam1, nam2);
        max = Math.max(tempMax, nam3);

        System.out.println( "Max değer  " + tempMax);


        int tempMin = Math.min(nam1, nam2);
        min = Math.min(tempMin, nam3);

        System.out.println( "Min değer  " + tempMin);
    }

}
