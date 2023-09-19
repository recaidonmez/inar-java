package Week_5_Assigments;
        //Kilogramdan pounda dönüşümü
public class Question_05_04_Milden_kilometreye_dönüşüm {

            public  static  void  main ( String [] args ) {

                // Bir milde sabit sayıda kilometre oluştur
                final double KILOMETERS_PER_MILE = 1.609;

                // Tablo başlığını göster
                System.out.println ("Mil      Kilometre" );

                // Milden kilometreye dönüşümü gösteren tabloyu oluşturun ve görüntüleyin

                for ( int  i = 1 ; i <= 10 ; i ++) {
                    System.out.printf (
                            "%-13d%-10.3f \n " , i , ( i * KILOMETERS_PER_MILE ));
                                                            //%-13d sağa doğru 13 boşluk koyar
                                                            //1f ise virgülsen donra kaç tane rakam alacağına karar verir.
                                                            //n\ ise alt alta satır yapar.
        }
    }           //,,,,,,,,,,,,
            //Mil      Kilometre
            //1            1,609
            // 2            3,218
            // 3            4,827
            // 4            6,436
            // 5            8,045
            // 6            9,654
            // 7            11,263
            // 8            12,872
            // 9            14,481
            // 10           16,090

}