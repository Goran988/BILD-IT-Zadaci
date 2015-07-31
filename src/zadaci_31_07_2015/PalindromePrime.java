package zadaci_31_07_2015;

public class PalindromePrime {
	/**
	 * Palindrome prime numbers are prime numbers that are also palindromes.
	 * E.g. 131. Write a program that prints first 100 palindrome prime numbers,
	 * ten per line.
	 * 
	 */
	public static void main(String[] args) {
		int counter = 0;
		int i = 0;
		while (counter < 100) { // loop will iterate 100 times

			i++;
			boolean isPrime = true; // boolean value is always set true, before
									// the checking if number is prime
			for (int j = 2; j < i; j++) {
				if (i % j == 0) { // if number is not prime we set isPrime to
									// false and brake the loop
					isPrime = false;
					break;
				}

			}
			if (isPrime && i != 1 && isPalindrome(i)) {
				System.out.print(i + " ");
				counter++;
				if (counter % 10 == 0) // every ten numbers we go to new line
					System.out.println();

			}
		}
	}

	public static int reverse(int num) {
		String line = Integer.toString(num); // convertig from int to string so
												// we can easier get number
												// backwards
		String res = "";
		for (int i = line.length() - 1; i >= 0; i--) {
			res += line.charAt(i); // adding digits to new string in reverse
									// order
		}
		return Integer.parseInt(res); // method returns number writen backwards
										// parsed into int
	}

	public static boolean isPalindrome(int num) {
		/**
		 * We're using reverse method to compare our number with reversed
		 * version, if they're the same it's a palindrome
		 */
		if (num == reverse(num))
			return true;
		else
			return false;

	}

}
