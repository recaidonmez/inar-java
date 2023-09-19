package Week_5_Assigments;

public class Question_05_39 {
    public static void main(String[] args) {
    // Create a consstant value for commmission sought
    final double HEDEF_KOMİSYON = 30000;
    double satışmiktarı, 				// Sales amount
            komisyon,				// Employee commission
            ortalama;					// ortalama satış
    satışmiktarı = 0;					// Initialize accumulator to 0
    do {
        ortalama = komisyon = 0;	// Set balance and commission to 0
        satışmiktarı += 0.01;			// Increase sales amount by $0.01

        // If sales amount is $10,000.01 and above commission rate is 12%
        if (satışmiktarı > 10000)
            komisyon += (ortalama = satışmiktarı - 10000) * 0.12;

        // If sales amount is $5,000.01-$10,000 commission rate is 10%
        if (satışmiktarı > 5000)
            komisyon += (ortalama -= ortalama - 5000) * 0.10;

        // If sales amount is $0.01-$5,000 commission rate is 8%
        if (satışmiktarı > 0)
            komisyon += ortalama * 0.08;

        // While commission is less than commission sought loop
    } while (komisyon < HEDEF_KOMİSYON);

    // Display results
    System.out.printf("Minimum sales to earn $30,000: $%.0f\n", satışmiktarı);
}
}
