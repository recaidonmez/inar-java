package Week_6_Assigmets;


public class Question_06_01_MatematikBeşgenSayılar {
    public static void main(String[] args) {

        //ilk on aıyı yazdır bir alt satıra geç
        System.out.println("İlk 100 pentagonel(beşgensel sayılar");
        for (int i = 1; i <= 100; i++) {
            if (i % 10 != 0) {
                System.out.printf("%9d", beşgenselSayılarıGöster(i)); // rakamları yazsı 9 tık attı

            } else {
                System.out.printf("%9d\n", beşgenselSayılarıGöster(i)); //11. sayıya gelince alt satıra geçti

            }
        }

    }

    public static int beşgenselSayılarıGöster(int sayı) {       //beşgensel sayının alınışı.

        return sayı * (3 * sayı - 1) / 2;   // rakamı veren formül.

    }
}
    //İlk 100 pentagonel(beşgensel sayılar
//        1        5       12       22       35       51       70       92      117      145
//      176      210      247      287      330      376      425      477      532      590
//      651      715      782      852      925     1001     1080     1162     1247     1335
//     1426     1520     1617     1717     1820     1926     2035     2147     2262     2380
//     2501     2625     2752     2882     3015     3151     3290     3432     3577     3725
//     3876     4030     4187     4347     4510     4676     4845     5017     5192     5370
//     5551     5735     5922     6112     6305     6501     6700     6902     7107     7315
//     7526     7740     7957     8177     8400     8626     8855     9087     9322     9560
//     9801    10045    10292    10542    10795    11051    11310    11572    11837    12105
//    12376    12650    12927    13207    13490    13776    14065    14357    14652    14950