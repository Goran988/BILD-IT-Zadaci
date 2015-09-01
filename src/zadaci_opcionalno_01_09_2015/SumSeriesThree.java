package zadaci_opcionalno_01_09_2015;

/**
 * Write a recursive method to compute the following series: 
 * m(i)=1/2 + 2/3 + ... + i/(i+1) Write a test program that displays 
 * m(i) for i = 1, 2, . . ., 10.
 */
public class SumSeriesThree {
	public static void main(String[] args) {
		System.out.printf("%.2f", sum(10));

	}
/**
 * recursive method that calculate sum of series stated in assignment
 * @param n - number "i" in the series
 * @return - sum of the series
 */
	public static double sum(double n) {
		//base case
		if (n < 1)
			return 0;
		return (n / (n + 1)) + sum(n - 1);
	}
}
