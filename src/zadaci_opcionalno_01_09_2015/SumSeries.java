package zadaci_opcionalno_01_09_2015;

/**
 * Write a recursive method to compute the following series: m(i)=1 + 1/2 +
 * 1/3... + 1/i Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */
public class SumSeries {

	public static void main(String[] args) {
		System.out.printf("%.2f", sum(10));

	}

	/**
	 * recursive method that sums series of numbers stated in assignment
	 * 
	 * @param n - number "i" from the series
	 * @return - sum of the series
	 */
	public static double sum(double n) {
		//base case
		if (n <= 1)
			return n;
		return 1 / n + sum(n - 1);

	}

}
