package Week_4_live_class;

public class DegerlerinYerdeğiştirmesi {
    public static void main(String[] args){

        int a = 7;
        int b = 5;

        System.out.printf("Değerler \na : %d\nb : %d\n",a,b);

        int c;

        c = a;
        a = b;
        b = c;

        System.out.printf("Değişmiş Değerler \na : %d\nb : %d\n",a,b,c);




        //Değerler
        //a : 7
        //b : 5
        //Değerler
        //a : 5
        //b : 7


    }
}
