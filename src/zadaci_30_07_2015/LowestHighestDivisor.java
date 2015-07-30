package zadaci_30_07_2015;

import java.util.Scanner;

public class LowestHighestDivisor {
	/**
	 * Write a program that asks user to enter 2 numbers, and than program
	 * writes him highest and lowest divisor for those numbers.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 integers:");			//user inputs two numbers
		int one = input.nextInt();
		int two = input.nextInt();
		int length = 0;
		if (one > two)										//if first is bigger, we'll user second as maximum of iterations for our loops
			length = two;
		else												//else we'll use second as maximum of iterations for our loops
			length = one;
		for (int i = 1; i <= length; i++) {					//loop starts at 1
			if (i != 1 && one % i == 0 && two % i == 0) {	//if both numbers are divisible by i with no remains and i is not 1, i is lowest common divisor
				System.out.println("Lowest common divisor is " + i);
				break;
			}
		}
		for (int i = length; i >= 1; i--) {					//loop starts at smaller of our two numbers
			if (one % i == 0 && two % i == 0) {				//if both are divisible by i with no remains i is greatest common divisor
				System.out.println("Greatest common divisor is " + i);
				break;
			}

		}
	}
}
