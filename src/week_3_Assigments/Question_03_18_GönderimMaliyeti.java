package week_3_Assigments;

import java.util.Scanner;

public class Question_03_18_GönderimMaliyeti {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Paketin ağırliğini pound cisinden girin : ");
    double ağırlık = input.nextDouble();

    // Gönderi bedeli hesaplanıyor.
    if (ağırlık > 20) {
        System.out.println("Paket gönderilemiyor.");
    } else {
        double maliyet;
        if (ağırlık > 0 && ağırlık <= 1) {
            maliyet = 3.5;
        } else if (ağırlık <= 3) {
            maliyet = 5.5;
        } else if (ağırlık <= 10) {
            maliyet = 8.5;
        } else {
            maliyet = 10.5;

        }
        System.out.println("Paketin kargo üçreti tl " + maliyet * ağırlık);
    }
}
}

//Paketin ağırliğini pound cisinden girin : 7
//Paketin kargo üçreti tl 59.5

//Paketin ağırliğini pound cisinden girin : 21
//Paket gönderilemiyor.