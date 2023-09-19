package Week_5_Assigments;

import java.util.Scanner;

public class Question_05_28_HerAyınİlkGünleriniGösterin {
    /*Her ayın ilk günlerini gösterin) Kullanıcıdan yılı ve yılın ilk gününü girmesini isteyen ve yıl içindeki
her ayın ilk gününü görüntüleyen bir program yazınız. Örneğin, kullanıcı 2013 yılını ve 1 Ocak
2013 Salı için 2 yılını girdiyse programınızın aşağıdaki çıktıyı görüntülemesi gerekir:*/
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    /// Kullanıcıdan yılı ve yılın ilk gününü girmesini isteyin
    System.out.print("Yıl giriniz: (örneğin, 2012):");
    int yıl = input.nextInt();

    System.out.print("Yılın ilk gününü giriniz: ");
    int gün = input.nextInt();

    String çıktı; 		// String çıktısını tutar

    for (int ay = 1; ay <= 12; ay++) {
        çıktı = "";		//Dizi çıktısını temizle
        switch (ay) {	// Çıkışa Ayı Birleştir
            case 1: çıktı += "January "; break;
            case 2: çıktı += "February "; break;
            case 3: çıktı += "March "; break;
            case 4: çıktı += "April "; break;
            case 5: çıktı += "May "; break;
            case 6: çıktı += "June "; break;
            case 7: çıktı += "July "; break;
            case 8: çıktı += "August "; break;
            case 9: çıktı += "September "; break;
            case 10: çıktı += "October "; break;
            case 11: çıktı += "November "; break;
            case 12: çıktı += "December "; break;
        }
        // Concat string
        çıktı += "1, " + yıl + " is ";

        // Compute the day of the month
        gün %= 7;
        // Display the output and the first day of the month
        switch (gün) {
            case 0: System.out.println(çıktı + "Sunday"); break;
            case 1: System.out.println(çıktı + "Monday"); break;
            case 2: System.out.println(çıktı + "Tuesday"); break;
            case 3: System.out.println(çıktı + "Wednesday"); break;
            case 4: System.out.println(çıktı + "Thursday"); break;
            case 5: System.out.println(çıktı + "Friday"); break;
            case 6: System.out.println(çıktı + "Saturday"); break;
        }

        // Add days of present month
        if ( ay == 1 || ay == 3  || ay == 5 || ay == 7 ||
                ay == 8 || ay == 10 ||ay == 12)
            gün += 31;
        else if (ay == 4 || ay == 6 || ay == 9 || ay == 11)
            gün += 30;
        else {
            if (((yıl % 4 == 0) && (yıl % 100 != 0)) || (yıl % 400 == 0))
                gün += 29;
            else
                gün += 28;
        }
    }
}
}
