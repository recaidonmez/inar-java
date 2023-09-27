package week_05.assignments;

public class Question_05_13 {
    public static void main(String[] args) {
        int maxn = 0;
        int n = 0;
        while (Math.pow(n, 3) < 12000) {
            maxn = n;
            n++;
        }
        System.out.println("The largest n is " + maxn);
    }
}
