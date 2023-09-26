package week_6_Class_live;
/*Bir yöntemi argümanla çağırdığınızda, argümanın değeri
+ x);
n++;
5
karşılık gelen parametre. Bu kavram, değere göre geçiş olarak bilinir. Argüman gerçek bir
değer yerine bir değişkense, değişkenin değeri parametreye iletilir. Ancak yöntem
içindeki parametrede yapılan herhangi bir değişiklik orijinal değişkeni etkilemez. Bu davranış
Örnek 6.4'te gösterilmektedir: x değişkeninin değeri (ki bu 1), artış yöntemini çağırmak için n
parametresine iletilir (satır 5). N parametresi yöntem içinde artırılır (satır 10), ancak x
değişkeni, yöntemin eylemlerinden bağımsız olarak etkilenmeden kalır.*/
public class Örnek_6_5_4_ArtırmaArgümanlarıDeğerlereGöreAktarmak {
    public static void main (String[] args ){
        int x = 1;
        System.out.println("Çagrı öncesi X-->" + x);
        arttırma(x);
        System.out.println("Çağrıdan sonra X -->" + x);

    }
    public static void arttırma(int n){
        n++;
        System.out.println("Yöntemin içindeki N -->" + n);

    }
}
    //Çagrı öncesi X-->1
//Yöntemin içindeki N -->2
//Çağrıdan sonra X -->1