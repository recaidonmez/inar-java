package week_04.live_class;

import java.util.Scanner;

public class FindTheCheapestGym {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the 3 locations of neighborhood gyms:");
        int gym1Location = input.nextInt();
        int gym2Location = input.nextInt();
        int gym3Location = input.nextInt();

        int gym1Price = 3;
        int gym2Price = 10;
        int gym3Price = 5;

        final double PRICE_PER_KM = 0.7;

        int distanceGym1 = Math.abs(gym1Location);
        int distanceGym2 = Math.abs(gym2Location);
        int distanceGym3 = Math.abs(gym3Location);

        double totalCostGym1 = (distanceGym1 * PRICE_PER_KM) * 2 + gym1Price;
        double totalCostGym2 = (distanceGym2 * PRICE_PER_KM) * 2 + gym2Price;
        double totalCostGym3 = (distanceGym3 * PRICE_PER_KM) * 2 + gym3Price;

        double tempCheapest = Math.min(totalCostGym1, totalCostGym2);
        double cheapest = Math.min(tempCheapest, totalCostGym3);

        System.out.printf("The cost of the gym1 is ( ( %3d * $%4.2f/km ) * 2 + %3d)\t = %5.2f\n", distanceGym1, PRICE_PER_KM, gym1Price, totalCostGym1);
        System.out.printf("The cost of the gym2 is ( ( %3d * $%4.2f/km ) * 2 + %3d)\t = %5.2f\n", distanceGym2, PRICE_PER_KM, gym2Price, totalCostGym2);
        System.out.printf("The cost of the gym3 is ( ( %3d * $%4.2f/km ) * 2 + %3d)\t = %5.2f\n", distanceGym3, PRICE_PER_KM, gym3Price, totalCostGym3);

        System.out.println("------------------------------");


        if (cheapest == totalCostGym1) {
            System.out.printf("The cheapest gym is gym1 at %d location with $%5.2f cost\n", gym1Location, totalCostGym1);
        } else if (cheapest == totalCostGym2) {
            System.out.printf("The cheapest gym is gym2 at %d location with $%5.2f cost\n", gym2Location, totalCostGym2);
        } else {
            System.out.printf("The cheapest gym is gym3 at %d location with $%5.2f cost\n", gym3Location, totalCostGym3);
        }

    }
}
