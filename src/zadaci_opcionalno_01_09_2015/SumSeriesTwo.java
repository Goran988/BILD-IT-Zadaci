package zadaci_opcionalno_01_09_2015;
/**
 * Write a recursive method to compute the following series:
 * m(i)=1/3 + 2/5+ 3/7 + 4/9 + 5/11 + 6/13 + ... + i/(2i+1)
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 */
public class SumSeriesTwo {

	public static void main(String[] args) {
		System.out.printf("%.2f", sum(10));

	}
	/**
	 * recursive method that sums number of the series stated in assignment
	 * @param n - number "i" from the series
	 * @return - sum of the series
	 */
	public static double sum(double n) {
		//base case
		if (n < 1)
			return n;
		return n / ((2 * n) + 1) + sum(n - 1);
	}

}
