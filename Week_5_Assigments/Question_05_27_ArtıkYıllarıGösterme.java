package Week_5_Assigments;
/*
(Artık yılları göster) Tüm artık yılları, her satırda on tane olacak şekilde görüntüleyen bir program yazınız.
101'den 2100'e kadar, tam olarak bir boşlukla ayrılmış. Ayrıca sayısını da göster
leap years in this period.
*/
public class Question_05_27_ArtıkYıllarıGösterme {

    public static void main(String[] args) {
    System.out.println("101'den 2100'e kadar olan tüm artık yıllar:\n ");
    int sayaç = 0;

    for (int yıl = 101; yıl <= 2100; yıl++) {

        // Artık yıl testi

        if ((yıl % 4 == 0 && yıl % 100 != 0) || yıl % 400 == 0) {
            sayaç++;
            // Tam olarak bir boşlukla ayrılmış satır başına on sonuç

            System.out.print(yıl + (sayaç % 10 == 0 ? "\n" : " "));
            /*sayaç% 10 satır sayısını gösteriri 20 olasa satı 20 olur

             */
        }
    }
    System.out.println();
}
}/*101'den 2100'e kadar olan tüm artık yıllar:

104 108 112 116 120 124 128 132 136 140
144 148 152 156 160 164 168 172 176 180
184 188 192 196 204 208 212 216 220 224
228 232 236 240 244 248 252 256 260 264
268 272 276 280 284 288 292 296 304 308
312 316 320 324 328 332 336 340 344 348
352 356 360 364 368 372 376 380 384 388
392 396 400 404 408 412 416 420 424 428
432 436 440 444 448 452 456 460 464 468
472 476 480 484 488 492 496 504 508 512
516 520 524 528 532 536 540 544 548 552
556 560 564 568 572 576 580 584 588 592
596 604 608 612 616 620 624 628 632 636
640 644 648 652 656 660 664 668 672 676
680 684 688 692 696 704 708 712 716 720
724 728 732 736 740 744 748 752 756 760
764 768 772 776 780 784 788 792 796 800
804 808 812 816 820 824 828 832 836 840
844 848 852 856 860 864 868 872 876 880
884 888 892 896 904 908 912 916 920 924
928 932 936 940 944 948 952 956 960 964
968 972 976 980 984 988 992 996 1004 1008
1012 1016 1020 1024 1028 1032 1036 1040 1044 1048
1052 1056 1060 1064 1068 1072 1076 1080 1084 1088
1092 1096 1104 1108 1112 1116 1120 1124 1128 1132
1136 1140 1144 1148 1152 1156 1160 1164 1168 1172
1176 1180 1184 1188 1192 1196 1200 1204 1208 1212
1216 1220 1224 1228 1232 1236 1240 1244 1248 1252
1256 1260 1264 1268 1272 1276 1280 1284 1288 1292
1296 1304 1308 1312 1316 1320 1324 1328 1332 1336
1340 1344 1348 1352 1356 1360 1364 1368 1372 1376
1380 1384 1388 1392 1396 1404 1408 1412 1416 1420
1424 1428 1432 1436 1440 1444 1448 1452 1456 1460
1464 1468 1472 1476 1480 1484 1488 1492 1496 1504
1508 1512 1516 1520 1524 1528 1532 1536 1540 1544
1548 1552 1556 1560 1564 1568 1572 1576 1580 1584
1588 1592 1596 1600 1604 1608 1612 1616 1620 1624
1628 1632 1636 1640 1644 1648 1652 1656 1660 1664
1668 1672 1676 1680 1684 1688 1692 1696 1704 1708
1712 1716 1720 1724 1728 1732 1736 1740 1744 1748
1752 1756 1760 1764 1768 1772 1776 1780 1784 1788
1792 1796 1804 1808 1812 1816 1820 1824 1828 1832
1836 1840 1844 1848 1852 1856 1860 1864 1868 1872
1876 1880 1884 1888 1892 1896 1904 1908 1912 1916
1920 1924 1928 1932 1936 1940 1944 1948 1952 1956
1960 1964 1968 1972 1976 1980 1984 1988 1992 1996
2000 2004 2008 2012 2016 2020 2024 2028 2032 2036
2040 2044 2048 2052 2056 2060 2064 2068 2072 2076
2080 2084 2088 2092 */
