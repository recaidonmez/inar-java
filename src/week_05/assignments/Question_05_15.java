package week_05.assignments;

public class Question_05_15 {
    public static void main(String[] args) {
        char ch;
        int start = '!';
        int end = '~';

        for (int i = start; i <= end; i++) {
            ch = (char) i;
            System.out.print(ch);
            System.out.print(i % 10 == 0 ? "\n" : " ");
        }
    }
}
