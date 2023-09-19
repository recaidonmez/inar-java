package Week_5_Assigments;
/*(Bir seriyi toplayın) Aşağıdaki serileri toplayan bir program yazın*/
public class Question_05_24_BirseriyiToplayın {

    public static void main(String[] args) {
        // Seriyi topla
    double toplam = 0.0;

    for (double n = 1.0; n <= 97.0; n += 2) {
        toplam += n / (n + 2);
    }

    System.out.println(
            "Series: 1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 + " +
                    " ... + 95 / 97 + 97 / 99");
    System.out.println("Seri toplamı: " + toplam);
}
}
/*Series: 1 / 3 + 3 / 5 + 5 / 7 + 7 / 9 + 9 / 11 + 11 / 13 +  ... + 95 / 97 + 97 / 99
Seri toplamı: 45.124450303050196*/