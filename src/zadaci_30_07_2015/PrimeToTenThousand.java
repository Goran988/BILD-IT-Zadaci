package zadaci_30_07_2015;

public class PrimeToTenThousand {
	/**
	 * Write a method that check if number is a prime number, and write a
	 * program that will write all prime numbers up to 100000.
	 */
	public static void main(String[] args) {
		for (int i = 0; i <= 100000; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean isPrime(int num) {
		/**
		 * method checks if the number is prime, returns true if it is and false
		 * if its not
		 */

		boolean isPrime = true;
		if (num != 0 && num != 1) {
			for (int i = 2; i < num; i++) {
				isPrime = true;
				if (num % i == 0 ) { 				//condition that checks if the number is prime
					isPrime = false;				//if condition fails isPrime is false and loop stops working
					break;
				}
			}
		} else
			return false;
		return isPrime;								
	}
}
