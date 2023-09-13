package Week_4_live_class;

public class Harf_sayısı {
    public static void main(String[] args) {

        //Bir dize
        //içindeki karakterlerin sayısını sağlamak için u

        String mesaj1 = "Javaya hoşgeldin.";
        System.out.println(  mesaj1 + " harf sayısı "
                + mesaj1.length());


        System.out.println( "x" +"------------------------------------------------------");
        // dizede harf bulma.
        String mesaj2 = "Javaya hoşgeldin.";
        System.out.println(  mesaj2 + " harf sayısı "
                + mesaj2.charAt(0));

        System.out.println( "x" +"------------------------------------------------------");

        String mesaj3 = "Javaya hoşgeldin.";
        System.out.println(  mesaj3 + " harf sayısı "
                + mesaj3.charAt(1));


        System.out.println( "x" +"------------------------------------------------------");

        // Üç dize birleştirildi
        String mesaj4 = "Javaya " + "hoş " + "gelsin";

        System.out.println( mesaj4);

        // String Bölümü 2 numarayla birleştirilmiştir
        String s = "Bölüm" + 2; // s bölüm birleştir

        System.out.println( s );
        System.out.println( "x" +"------------------------------------------------------");

        // Dize Eki B karakteriyle birleştirilmiştir
        String s1 = "EK" + 'B'; // keleime ekleme

        System.out.println( s1);

    }
}
