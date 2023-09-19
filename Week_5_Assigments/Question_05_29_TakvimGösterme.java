package Week_5_Assigments;
/*(Takvimleri göster) Kullanıcıdan yılı ve yılın ilk gününü girmesini isteyen ve konsolda yıla ait takvim
tablosunu görüntüleyen bir program yazınız. Örneğin, kullanıcı 2013 yılını ve 1 Ocak 2013 Salı için
2'yi girdiyse , programınız yılın her ayı için takvimi aşağıdaki gibi göstermelidir*/
import java.util.Scanner;

public class Question_05_29_TakvimGösterme {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        // Kullanıcıdan yılı ve yılın ilk gününü girmesini isteyin
    System.out.print("Yıl gir: ");
    int yıl = input.nextInt();
    System.out.print("yılın ilk gününü gir: ");
    int gün = input.nextInt();

    // Create header of calender
    String başlık;
    System.out.println();
    for (int ay = 1; ay <= 12; ay++) {
        başlık = "";
        // Concat current month string to header
        switch (ay) {
            case 1: başlık += "January "; break;
            case 2: başlık += "February "; break;
            case 3: başlık += "March "; break;
            case 4: başlık += "April "; break;
            case 5: başlık += "May "; break;
            case 6: başlık += "June "; break;
            case 7: başlık += "July "; break;
            case 8: başlık += "August "; break;
            case 9: başlık += "September "; break;
            case 10: başlık += "October "; break;
            case 11: başlık += "November "; break;
            case 12: başlık += "December "; break;
        }
        // Geçerli ay dizesini başlığa bağla
        başlık += yıl + "";

        /// Başlık dizesini ortala
        for (int b = 0; b < 23 - (başlık.length() / 2); b++) {
            System.out.print(" ");
        }

        // Başlığı ve haftanın günleri dizesini görüntüle
        System.out.println(
                başlık + "\n-----------------------------------------------\n " +
                        "Sun    Mon    Tue    Wed    Thu    Fri    Sat");

        // Haftanın gününü hesapla
        gün %= 7;
        for (int b = 0; b <= gün * 7; b++) {
            System.out.print(" ");
        }

        // İçinde bulunduğumuz ayın son gününü hesapla
        int sonGüm = 0;
        if ( ay == 1 || ay == 3  || ay == 5 || ay == 7 ||
                ay == 8 || ay == 10 ||ay == 12)
            sonGüm += 31;
        else if (ay == 4 || ay == 6 || ay == 9 || ay == 11)
            sonGüm += 30;
        else { //Artık yılı test et
            if (((yıl % 4 == 0) && (yıl % 100 != 0)) || (yıl % 400 == 0))
                sonGüm += 29;
            else
                sonGüm += 28;
        }

        // Geçerli ayın takvimini göster
        for (int d = 1; d <= sonGüm; d++) {
            // 10'dan küçük sayıların önüne siyah boşluk ekleyin
            if (d < 10)
                System.out.print(" ");
            //  Cumartesiden sonra yeni satıra başla
            if (gün % 7 == 6)
                System.out.print(d + "\n ");
            else {
                System.out.print(d + "     ");
                // Ayın son gününden sonra yeni satıra geç
                if (d == sonGüm)
                    System.out.println();
            }
            gün++;

        }
        System.out.println();
    }
}
}
