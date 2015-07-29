package zadaci_29_07_2015;

public class PrimesTwoToThousand {
	/**
	 * Write a program that writes prime numbers from two to thousand including
	 * those two.
	 */
	public static void main(String[] args) {
		int nums = 8;
		int counter = 0;
		for (int i = 2; i <= 1000; i++) {							//loop that goes from 2 to 1000
			boolean isPrime = true;									//we set number isPrime to true by default
			for (int j = 2; j < i; j++) {
				if (i % j == 0 && i != 1000) {						//if condition fails
					isPrime = false;								//we set isPrime to false(also included 1000 so it can be printed)
					break;
				}
			}
			if (isPrime && i != 1 && i != 0) {						//if number passed the check we print it
				counter++;											//every time we print number we 
				System.out.print(i + " ");
				if (counter % nums == 0) {							//if counter can be devised by number we want to print per line, we go to the next line
					System.out.println();
				}
			}

		}

	}

}
