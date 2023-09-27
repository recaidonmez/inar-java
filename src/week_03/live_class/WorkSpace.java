package week_03.live_class;

import java.util.Scanner;


public class WorkSpace {
    public static void main(String[] args) {
        int x = -5;
        boolean booleanValue = false;

        System.out.println("Boolean value -> " + booleanValue);
        System.out.println("Boolean !value -> " + !booleanValue);

        boolean andOperator = true && false;
        System.out.println("&& Operator -> " + andOperator);

        boolean orOperator = false || false;
        System.out.println("|| Operator -> " + orOperator);

        boolean exclusiveOrOperator = false ^ false;
        System.out.println("^ operator -> " + exclusiveOrOperator);
    }
}
