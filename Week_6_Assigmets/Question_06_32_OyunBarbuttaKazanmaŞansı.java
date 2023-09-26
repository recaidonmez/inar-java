package Week_6_Assigmets;

/*
((Oyun: barbutta kazanma şansı) Egzersiz 6.30'u 10.000 kez çalıştıracak şekilde revize edin
ve kazanan oyunların sayısını görüntüleyin.
*/
public class Question_06_32_OyunBarbuttaKazanmaŞansı {
	/** Main Metod */
	public static void main(String[] args) {
		int sayaç = 0;
		for (int i = 1; i <= 3; i++) {
			if (oyunaBaşla() == 1)
				sayaç++;
		}
		System.out.println("Kazanılan oyun sayısı: " + sayaç);
	}

	/** Method playCraps */
	public static int oyunaBaşla(){
		// Roll two dice
		int zar1 = zarAt();
		int zar2 = zarAt();

		// Sonucu göster
		skoruGörüntüle(zar1, zar2);

		// İki zarın toplamını kontrol edin.
		int nokta = toplamıKontrol(zar1, zar2);
		if (nokta <= 1) {
			sonuçGöster(nokta);
			return nokta;
		}

		// eğer toplam başka bir değer ise (yani 4, 5, 6, 8, 9 veya 10),
		//	 bir nokta belirlendi. kadar zar atmaya devam edin
		//	 ya 7 ya da aynı puan değeri yuvarlanır.
		int toplam;
		do {	
			// İki zar atıyoruz
			zar1 = zarAt();
			zar2 = zarAt();
			toplam = zar1 + zar2;
		} while (toplam != nokta && toplam != 7);

		// onucunu göster

		skoruGörüntüle(zar1, zar2);

		// 7 gelirse kaybedersiniz. Aksi halde kazanırsınız
		if (toplam == 7) {
			sonuçGöster(0);
			nokta = 0;
		}
		else {
			sonuçGöster(1);
			nokta = 1;
		}
		return nokta;
	}

	/** Zar at motodu*/
	public static int zarAt() {
		//1'den 6'ya kadar rastgele bir sayı üretelim
		return (int)(1 + Math.random() * 6);
	}

	/** yöntemi sonucu döndürür */
	public static int toplamıKontrol(int dice1, int dice2) {
		// Eğer nokta 2, 3 veya 12 ise 0'ı geri döndürün (kaybedersiniz)
		// eğer puan 7 veya 11 ise 1 değerini döndür (kazanırsın)
		int sum = dice1 + dice2;
		switch (sum) {
			case 2  : 
			case 3  :
			case 12 : return 0;
			case 7  : 
			case 11 : return 1;
		}
		return sum;
	}

	/**  yöntemi oyuncunun kazanıp kazanmadığını görüntüler */
	public static void sonuçGöster(int sonuç) {
		if (sonuç == 0)
			System.out.println("Kaybetin   ");
		else 
			System.out.println("Kazandın  ");
	}

	/** yöntemi atılan zarın sonucunu görüntüler */
	public static void skoruGörüntüle(int zar1, int zar2) {
		System.out.println(
			"Attın  " + zar1 + " + " + zar2 + " = " + (zar1 + zar2));
	}
}		/*Attın  5 + 2 = 7
	Kazandın
	Attın  5 + 2 = 7
	Kazandın
	Attın  6 + 5 = 11
Kazandın
Kazanılan oyun sayısı: 3*/