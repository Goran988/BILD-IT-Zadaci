package zadaci_14_08_2015;

import java.math.BigInteger;

/**
 * Find the first ten numbers with 50 decimal digits that are divisible by 2 or
 * 3
 *
 */
public class DivisableByTwoAndThree {

	public static void main(String[] args) {
		// BigInteger object with total of 50 decimal spaces
		BigInteger num = new BigInteger(
				"10000000000000000000000000000000000000000000000000");
		// BigInteger object with value of 2
		BigInteger two = new BigInteger("2");
		// BigInteger object with value of 3
		BigInteger three = new BigInteger("3");
		// counter
		int count = 0;
		// loop that will run until counter reaches 10
		while (count < 10) {
			// remainder of division of number we're testing with number 2
			BigInteger remTwo = num.remainder(two);
			// remainder of division of number we're testing with number 3
			BigInteger remThree = num.remainder(three);
			// BigInteger object with value 0
			BigInteger zero = BigInteger.ZERO;
			// BigInteger object with value 1
			BigInteger one = BigInteger.ONE;
			// if both remainders are equal to zero print out the number and
			// increment counter by 1
			if (remTwo == zero && remThree == zero) {
				System.out.println(num);
				count++;
			}
			// increment number we're testing by one
			num = num.add(one);
		}
	}

}
