package Week_5_Assigments;

public class Question_05_12_EnKüçükSayıyBulma {

        //((𝑛2 > 12.000 olacak şekilde en küçük n'yi bulun) En küçük 2'ye while döngüsü kullanın
        //𝑛2 12.000'den büyük olacak şekilde tamsayı n nedir?
    public static void main(String[] args) {

        int n = 0;
        while (Math.pow(n, 2) < 12000) {
            n++;
        }
        System.out.println("En küçük sayı " + n * -1);
    }
}

        //En küçük sayı -110