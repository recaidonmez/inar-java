package week_04.live_class;

import java.util.Scanner;

public class GeoCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         *
         * double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
         * double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
         * double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
         */
//
//        double atlantaX = input.nextDouble();
//        double atlantaY = input.nextDouble();
//        double charlotteX = input.nextDouble();
//        double charlotteY = input.nextDouble();
//        double savannahX = input.nextDouble();
//        double savannahY = input.nextDouble();

        double atlantaX = 33.74;
        double atlantaY = -84.387;
        double charlotteX = 35.227;
        double charlotteY = -80.843;
        double savannahX = 32.08;
        double savannahY = -81.0998342;

        double distanceAtlantaToCharlotte = Math.sqrt((Math.pow((atlantaX - charlotteX), 2) +
                (Math.pow((atlantaY - charlotteY), 2))));

        System.out.println("The distance between Atlanta and Charlotte is : " + distanceAtlantaToCharlotte);


    }
}
