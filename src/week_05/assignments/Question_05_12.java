package week_05.assignments;

public class Question_05_12 {
    public static void main(String[] args) {
        int n = 0;
        while (Math.pow(n, 2) < 12000) {
            n++;
        }
        System.out.println("The smallest n is " + n * -1);
    }
}
