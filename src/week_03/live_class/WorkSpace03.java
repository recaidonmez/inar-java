package week_03.live_class;

import java.util.Scanner;

public class WorkSpace03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1 for monday 2 for tuesday and so ! -> ");
        int day = input.nextInt();
        int x = 2;
        int y = 2;




        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
