package week_6_Class_live;

public class Örnek_6_9_DeğişkenlerinKapsamı {
    public static void main(String[] args){

    int x =5;
    for(int i = 0; i<10; i++) {
        System.out.println(i);
        for(int j =0; j < 5; j++){
            System.out.println(x);
            System.out.println(i);
        }
    }
        System.out.println(x);
}
}

