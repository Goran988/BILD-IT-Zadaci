package zadaci_31_07_2015;

public class EmirpNumbers {
	// Emirp numbers are prime numbers printed backwards. Write a program that
	// writes first 100 prime numbers, 10 per line.
	public static void main(String[] args) {
		int counter = 0;
		int i = 0;
		while (counter < 100) {						//loop will iterate 100 times

			i++;									
			boolean isPrime = true;					//boolean value is always set true, before the checking if number is prime
			for (int j = 2; j < i; j++) {			
				if (i % j == 0) {					//if number is not prime we set isPrime to false and brake the loop
					isPrime = false;
					break;
				}

			}
			if (isPrime && i>9) {					//emirp are numbers have to be two digits minimum
				counter++;
				reverse(i);							//we're invoking reverse method that will print numbers backwards
				if(counter%10==0)					//every ten numbers we go to new line
					System.out.println();
				
			}
		}
	}

	public static void reverse(int num) {
		String line = Integer.toString(num); // converting from int to string
		String res = ""; // new string that we will use to store new number
		for (int i = line.length() - 1; i >= 0; i--) { // loop going from the
														// back of the string to
														// the 0 index
			res += line.charAt(i); // adding to the res string one one by one
									// "digit" from back to front
		}
		System.out.print(res+" "); // printing out the result
	}
}
