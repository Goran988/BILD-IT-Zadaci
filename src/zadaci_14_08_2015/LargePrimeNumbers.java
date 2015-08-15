package zadaci_14_08_2015;

import java.math.BigInteger;

/**
 * Write a program that finds five prime numbers larger than Long.MAX_VALUE.
 *
 */
public class LargePrimeNumbers {

	public static void main(String[] args) {
		// counter
		int count = 0;
		// BigInteger object with value of maximum value of long number
		BigInteger num = BigInteger.valueOf(Long.MAX_VALUE);
		// loop that will run until counter reaches 5
		while (count < 5) {
			// we invoke isProbablePrime method from BigInteger class, if number
			// is prime we print it out and increment counter by 1
			if (num.isProbablePrime(1)) {
				System.out.println(num);
				count++;
			}
			// in each iteration we increment number by 1
			num = num.add(BigInteger.ONE);
		}

	}

}
