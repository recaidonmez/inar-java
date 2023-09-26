package Week_6_Assigmets;


/*
(Geçerli tarih ve saati görüntüleyin) Liste 2.7, ShowCurrentTime.java,
şimdiki zaman. Geçerli tarih ve saati görüntülemek için bu örneği geliştirin. Takvim
Liste 6.12'deki PrintCalendar.java örneği size bazı fikirler verecektir.
yıl, ay ve gün nasıl bulunur?
*/

public class Question_06_24_GüncelTarihveSaat {
	/** Main Method */
	public static void main(String[] args) {
		// Display current date and time
		System.out.println("saat---->"+ saat());
		System.out.println("yıl--->"+tarih());
		System.out.println("ay-->" + ay());
		System.out.println("gün-->"+ gün());
	}

	/** Yöntem zamanı geçerli zamanı döndürür *************************************/
	public static String saat() {
		final long SAAT_DILIMI_FARKI = -4; //ABD Saat diliminin GMT'ye kaydırılması

		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long toplamSaat = System.currentTimeMillis();

		// 1 Ocak 1970 gece yarısından bu yana geçen toplam milisaniyeyi elde edin
		toplamSaat /= 1000;

		// Geçerli dakikayı ve saniyeyi elde et
		String güncelDakikaSaniye = ""; // Dakika ve Saniyeleri Tutar
		for (int i = 0; i < 2; i++) {
			güncelDakikaSaniye =
				(toplamSaat % 60 < 10 ? ":0" + toplamSaat % 60 : ":" + toplamSaat % 60)
				+ güncelDakikaSaniye;
			toplamSaat /= 60;
		}
		
		String setAmOrPm = "";
		//  Geçerli saati 12 formatında elde et
		long güncelSaat = toplamSaat % 24;
		if (güncelSaat == 0)
			güncelSaat = 24;

		if (güncelSaat > 12) {
			güncelSaat -= 12;
			setAmOrPm = " PM";
		}
		else
			setAmOrPm = " AM";

		//GMT'ye saat dilimi farkı eklendi
		güncelSaat += SAAT_DILIMI_FARKI;

		return güncelSaat + güncelDakikaSaniye + setAmOrPm;
	}

	/** Metod tarih **************************************************************/
	public static String tarih() {
		
		return yıl() + "";
	}

	/** Yöntem yılı geçerli yılı döndürür *************************************/
	public static int yıl() {
		//İçinde bulunduğumuz yılı elde ediyoruz
		int güncelYıl =
			(int)(System.currentTimeMillis() / millisecondPerYear()) + 1970;
		
		return güncelYıl;
	}

	/** Ay yöntemi geçerli ayı döndürür ***********************************/
	public static int ay() {
		// Obtain the current month
		int güncelAy =
			(int)((System.currentTimeMillis() % millisecondPerYear()) 
			/ millisecondsPerMonth());
		return güncelAy + 1;
	}

	/** Yöntem günü geçerli günü döndürür ***************************************/
	public static int gün(){
		// İçinde bulunduğumuz günü elde ediyoruz
		return  getTotalNumberOfDays(yıl(), ay());
	}

	/** Yöntem milisaniyePerYıl */
	public static double millisecondPerYear() {
		return 3.15569E10;
	}

	/** Yöntem milisaniyePerMonth */
	public static double millisecondsPerMonth() {
		return 2.63E9;
	}

	/** 1 Ocak 1800'den bu yana geçen toplam gün sayısını alın */
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;	
		// 1800'den 1/1/yıl'a kadar toplam günleri alın
		for (int i = 1800; i < year; i++)
		if (isLeapYear(i))
		total = total + 366;
		else
		 total = total + 365;
		
		// Ocak ayından takvim ayından önceki aya gün ekleyin
		for (int i = 1; i < month; i++)
		total = total + getNumberOfDaysInMonth(year, i);
		
		return total;
	}

	/** Method Artık Yıl */
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 400 != 0);
	}

	/** Bir aydaki gün sayısını alın */
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
		month == 8 || month == 10 || month == 12)
		return 31;
	
		if (month == 4 || month == 6 || month == 9 || month == 11)
		return 30;
	
		if (month == 2) return isLeapYear(year) ? 29 : 28;
		
		return 0; // Ay yanlışsa
	}

}