package Week_5_Assigments;

public class Question_05_40 {public static void main(String[] args) {
    int heads, 				// Counts the number of heads
            tails, 				// Counts the number of tails
            coin; 				// Coin
    heads = tails = 0;	// Initialize heads and tails to 0;

    // Simulate flipping a coin one millon times
    System.out.println("Fipping a coin one millon times..");
    for (int i = 0; i < 1000000; i++) {
        // Generate randomly 0 or 1.
        // If 0 increament heads otherwise increment tails
        coin = (int)(Math.random() * 2) == 0 ? heads++ : tails++;
    }

    // Display results
    System.out.println(
            "Heads: " + heads +
                    "\nTails: " + tails);
}
}
