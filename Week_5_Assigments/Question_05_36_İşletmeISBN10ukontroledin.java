package Week_5_Assigments;

import java.util.Scanner;

public class Question_05_36_İşletmeISBN10ukontroledin {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Kullanıcıdan 10 haneli ISBN'nin ilk 9 hanesini girmesi isteniyor
    System.out.print("ISBN'nin ilk 9 hanesini tamsayı olarak girin: ");
    String isbn = input.nextLine();

    int d10 = 0;
        // ISBN'nin rakamlarını çıkartın ve d10'u hesaplayın
    for (int i = 0; i < 9; i++) {
        d10 += Integer.parseInt(isbn.charAt(i) + "") * (i + 1);
    }
    d10 %= 11;

        // 10 haneli ISBN'yi göster
    for (int i = 0; i < 9; i++) {
        System.out.print(isbn.charAt(i));
    }
    if (d10 == 10)
        System.out.println("X");
    else
        System.out.println(d10);
}
}
