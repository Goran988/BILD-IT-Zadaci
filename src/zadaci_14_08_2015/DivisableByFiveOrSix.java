package zadaci_14_08_2015;

import java.math.BigInteger;

public class DivisableByFiveOrSix {
	/**
	 * Find the first ten numbers greater than Long.MAX_VALUE that are divisible
	 * by 5 or 6.
	 */
	public static void main(String[] args) {
		// BigInteger object with value of maximum long number
		BigInteger num = BigInteger.valueOf(Long.MAX_VALUE);
		// BigInteger object with value of 5
		BigInteger five = new BigInteger("5");
		// BigInteger object with value of 6
		BigInteger six = new BigInteger("6");
		// counter
		int count = 0;
		// loop that run until counter reaches 10
		while (count < 10) {
			// BigInteger object with value of remainder (division num/five)
			BigInteger remFive = num.remainder(five);
			// BigInteger object with value of remainder (division num/six)
			BigInteger remSix = num.remainder(six);
			// BigInteger object value of 0
			BigInteger zero = BigInteger.ZERO;
			// BigInteger object value of 1
			BigInteger one = BigInteger.ONE;
			// if remainders of divisin by 5 or 6 are zero prints out a number
			// and counter gets incremented
			if (remFive == zero || remSix == zero) {
				System.out.println(num);
				count++;

			}
			// number gets incremented by 1
			num = num.add(one);
		}

	}

}
