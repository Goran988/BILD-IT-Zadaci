package zadaci_14_08_2015;

import java.math.BigInteger;

/**
 * Find the first ten square numbers that are greater than Long.MAX_VALUE. A
 * square number is a number in the form of n2. For example, 4, 9, and 16 are
 * square numbers.
 * 
 */
public class SquareNumbers {

	public static void main(String[] args) {
		// counter
		int count = 0;
		// BigInteger object with value of maximum value of long number
		BigInteger num = BigInteger.valueOf(Long.MAX_VALUE);
		// formated version of square value of maximum long number(we got a
		// rounded version of a square value)
		String squareRootOfMaxLong = String.format("%.0f",
				Math.sqrt(Long.MAX_VALUE));
		// object of BigInteger class created with square root value of max long
		// number
		BigInteger squareMaxLong = new BigInteger(squareRootOfMaxLong);
		// loop that will run until counter reaches 10, in the loop we check if
		// the current number is a square number
		while (count < 10) {
			if (squareMaxLong.multiply(squareMaxLong).compareTo(num) >= 0) {
				System.out.println(squareMaxLong.multiply(squareMaxLong));
				count++;
			}
			// we increment the squareMaxLong number by 1 in each iteration of
			// the loop
			squareMaxLong = squareMaxLong.add(BigInteger.ONE);

		}
	}
}
