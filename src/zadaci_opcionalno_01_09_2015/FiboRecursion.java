package zadaci_opcionalno_01_09_2015;

import java.util.Scanner;

/**
 * Use recoursion to find fibonacci number at index user entered.
 */
public class FiboRecursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter index of fibonacci number you want:");
		System.out.println(fibo(input.nextInt()));
		input.close();

	}
/**
 * Recourisve method that finds fibonacci number at wanted index.
 * @param n - index of the number
 * @return - number at wanted index
 */
	public static int fibo(int n) {
		//base case
		if (n == 1 || n == 0)
			return n;
		else
			return fibo(n - 2) + fibo(n - 1);
	}

}
