package zadaci_opcionalno_01_09_2015;

import java.util.Scanner;

/**
 * The gcd(m, n) can also be defined recursively as follows: If 
 * m % n is 0, gcd(m, n) is n. Otherwise, 
 * gcd(m, n) is gcd(n, m % n). Write a recursive
 * method to find the GCD. Write a test program that prompts the user to enter
 * two integers and displays their GCD.
 * 
 * @author Goran
 *
 */
public class RecursiveGCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter two integers you want to find greatest common divisor for:");
		System.out.println(gcd(input.nextInt(), input.nextInt()));
		input.close();
	}

	/**
	 * Recoursive method that finds greatest common divisor for two integers
	 * 
	 * @param a
	 *            - first number
	 * @param b
	 *            - second number
	 * @return - greatest common divisor
	 */
	public static int gcd(int a, int b) {
		//base case
		if (a == 0 || b == 0)
			return a + b;
		return gcd(b, a % b);
	}

}
