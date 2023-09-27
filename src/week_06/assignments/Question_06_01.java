package week_06.assignments;

public class Question_06_01 {
	/** Main Method */
	public static void main(String[] args) {
		final int NUMBER_OF_PENTAGONALS = 100; // Display the first 100 pentagonals
		final int NUMBER_PER_LINE = 10; // Display 10 number per line

		// Display the first 100 pentagol numbers
		System.out.println("The first 100 pentagonal numbers, ten per line: ");
		for (int i = 1; i <= NUMBER_OF_PENTAGONALS; i++) {
			// Print ten numbers per line
			if (i % NUMBER_PER_LINE == 0) 
				System.out.printf("%7d\n", getPentagonalNumber(i));
			else
				System.out.printf("%7d", getPentagonalNumber(i));
		}
	}

	/** Return a pentagonal number */
	public static int getPentagonalNumber(int n) {
		return (n * (3 * n - 1)) / 2;
	}
}