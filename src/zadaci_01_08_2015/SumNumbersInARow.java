package zadaci_01_08_2015;

public class SumNumbersInARow {
	/**
	 * Write a program that adds all the numbers in the row 1/3 + 3/5 + 5/7 +
	 * 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.
	 * 
	 */
	public static void main(String[] args) {
		double sum = 0;
		double j = 3;
		for (int i = 1; i <= 97; i += 2, j += 2) { // incrementing both numbers
													// by 2 in every iteration
			sum += (i / j); // adding the result of division i/j to sum
		}
		System.out.printf("%.2f", sum); // printing out the result

	}

}
