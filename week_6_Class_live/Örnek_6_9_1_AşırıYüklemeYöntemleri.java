package week_6_Class_live;

public class Örnek_6_9_1_AşırıYüklemeYöntemleri {
    public static void main(String[] args){
        int i =5;
        int j =10;
        double num1 =5.4;
        double num2 =7.4;
        double num3 =9.1;

        System.out.println(max(num1,num2,num3));
        }
        public static  int max(int i, int j){
        return (i > j) ? i :j;
        }

        public static double max(double i, double j){
        return(i>j) ? i :j; //bir koşul operatörüdür. Bu operatör, i değeri j değerinden büyükse i’yi döndürür;
            // aksi takdirde j’yi döndürür. Örneğin,
            // i’nin değeri 5 ve j’nin değeri 3 ise, bu ifade 5 döndürür. Eğer i’nin değeri 2 ve j’nin değeri 7 ise, bu ifade 7 döndürür

            }
            public static double max(double i, double j, double k){
            return max(max(i,j),k);
            }

}
