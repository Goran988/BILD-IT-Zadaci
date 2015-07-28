package zadaci_28_07_2015;

public class TwinPrimes {
	/**
	 * @author Goran Write a program that writes all twin prime numbers under
	 *         10000 in pairs 10 per line.
	 */
	public static void main(String[] args) {
		int count = 0;											
		for (int i = 1; i < 9999; i++) {										//loop that will go up to 9999
			if (isPrime(i) && isPrime(i + 2) && i != 1) {						//checking if number i and i+2 are prime numberse
				System.out.print("(" + i + "," + (i + 2) + ") ");				//if they both are we print them as pair
				count++;
				if(count%10==0){												//every 10 printed pairs we start printing in next line
					System.out.println();
				}
			}
		}
	}

	public static boolean isPrime(int num) {		//method checks if the number is prime	 returns true if it is and false if it's not 
		boolean isPrime = true;
		for (int i = 1; i <= num; i++) {
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
}