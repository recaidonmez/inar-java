package Week_5_Assigments;
        //Sayıları piramit düzeninde görüntüleyin) Aşağıdaki çıktıyı yazdıran iç içe geçmiş bir for döngüsü
        //yazın:
public class Question_05_19_PramitYapma {

    public static void main(String[] args) {

        int n = 8;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print("  ");
            }

            for (int k = 0; k < i; k++) {
                System.out.printf("%4d", (int) Math.pow(2, k));
            }
            for (int m = 1; m <= i - 1; m++) {
                System.out.printf("%4d", (int) Math.pow(2, i - m - 1));
            }

            System.out.println();
        }
    }
}
        //
//                               1
//                           1   2   1
//                       1   2   4   2   1
//                   1   2   4   8   4   2   1
//               1   2   4   8  16   8   4   2   1
//           1   2   4   8  16  32  16   8   4   2   1
//       1   2   4   8  16  32  64  32  16   8   4   2   1
//   1   2   4   8  16  32  64 128  64  32  16   8   4   2   1