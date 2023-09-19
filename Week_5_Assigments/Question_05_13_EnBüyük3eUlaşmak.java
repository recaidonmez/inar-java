package Week_5_Assigments;
    //(𝑛 < 12.000 olacak şekilde en büyük n'yi bulun) En büyük 3'e ulaşmak için bir while döngüsü kullanın
//𝑛 12.000'den küçük olacak şekilde tamsayı

public class Question_05_13_EnBüyük3eUlaşmak {
    public static void main(String[] args) {
        int maxn = 0;
        int n = 0;
        while (Math.pow(n, 3) < 12000) {
            maxn = n;
            n++;
        }
        System.out.println("En büyük " + maxn);
    }
}

        //En büyük 22