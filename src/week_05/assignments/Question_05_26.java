package week_05.assignments;

public class Question_05_26 {
    public static void main(String[] args) {
        double e = 1, p = 1;

        for (int i = 1; i <= 100000; i++) {
            p = p / i;
            e += p;
            if (i == 10000) {
                System.out.println("e at i = 10000 is " + e);
            } else if (i == 20000) {
                System.out.println("e at i = 20000 is " + e);
            } else if (i == 100000) {
                System.out.println("e at i = 100000 is " + e);
            }
        }
        System.out.println("Java's e is " + Math.E);
    }
}