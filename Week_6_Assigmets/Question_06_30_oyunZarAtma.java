package Week_6_Assigmets;

/*
Oyun: barbut) Barbut, kumarhanelerde oynanan popüler bir zar oyunudur. Oyunun bir varyasyonunu oynamak
için aşağıdaki gibi bir program yazın:
(3, 5)
(5, 7)
(İkiz asal sayılar) İkiz asal sayılar, aralarında 2 fark bulunan bir çift asal sayıdır. Örneğin, 3 ve 5
ikiz asaldır, 5 ve 7 ikiz asaldır ve 11 ve 13 ikiz asaldır.
**Soru_06_30:
**Soru_06_29:
İşte bazı örnek çalıştırmalar.

*/
public class Question_06_30_oyunZarAtma {
	/** Main Metod */
	public static void main(String[] args) {
		//İki zar atıyoruz
		int noktalar = ikiZarAtma();

		// İki zarın toplamını barbut veya doğal olarak kontrol edin
		int sonuç = sonuçGösterMe(noktalar);

		// Sonuç barbut veya doğal baskı sonucu ise
		if (doğalSonuçMU(sonuç))
			sonucuGöster(sonuç);
		else {
			// Kazanana veya kaybedene kadar zar atmaya devam et
			KazananaKaybedeneKadarAt(sonuç);
		}
	}

	/** Method rollDice */
	public static int zarAt() {
		// 1'den 6'ya kadar rastgele bir sayı üretelim
		return (int)(1 + Math.random() * 6);
	}

	/** Method printRoll prints the sum of the two dice */
	public static int ikiZarAtma() {
		int zar1 = zarAt();
		int zar2 = zarAt();
		int toplam = zar1 + zar2;
		System.out.println("Sen at " + zar1 + " + " + zar2 + " = " + toplam);
		return toplam;
	}

	/** sonucuGöster yöntemi sonucu döndürür */
	public static int sonuçGösterMe(int nokta) {
		// Eğer nokta 2, 3 veya 12 ise 0 değerini döndür, Eğer nokta 7 veya 11 ise 1 değerini döndür
		switch (nokta) {
			case 2  :
			case 3  :
			case 12 : nokta = 0; break;
			case 7  : 
			case 11 : nokta = 1; break;
		}
		return nokta;
	}

	/** PrintResult yöntemi oyuncunun kazanıp kazanmadığını görüntüler */
	public static void sonucuGöster(int result) {
		if (result == 0)
			System.out.println("Kaybettin");
		else if (result == 1)
			System.out.println("Kazandın");
	}

	/** NaturalOrCraps yöntemi, kazanıp kaybetmeniz durumunda true değerini döndürür. Aksi takdirde yanlış */
	public static boolean doğalSonuçMU(int result) {
		return result == 0 || result == 1;
	}

	/** rollTillWinOrLose yöntemi, iki zar atılana kadar tekrarlanır
	 7 veya aynı puan değerinde bir atış yapılır. sonra sonucu yazdırır  */
	public static void KazananaKaybedeneKadarAt(int point) {
		int sonuç;

		do {
		 	sonuç = ikiZarAtma();
		} while (sonuç != point && sonuç != 7);

		// 7 gelirse kaybedersiniz. Aksi takdirde kazanırsınız.
		if (sonuç == 7)
			sonucuGöster(0);
		else
			sonucuGöster(1);
	}	
}