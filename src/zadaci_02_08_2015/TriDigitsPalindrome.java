package zadaci_02_08_2015;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriDigitsPalindrome {
	/**
	 * Write a program that asks user for a three digits number and checks if
	 * it's palindrome(number is same when you read it backwards).
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 digits number:");
		int num = 0;
		try {									//we're using try statement to make sure program doesn't crash if user enters something other than number			
			num = input.nextInt();				
		} catch (InputMismatchException ex) {
			System.out.println("You made wrong input.");		//if exception occurs we notify the user and close the program
			System.exit(1);
		}
		System.out.println(isPalindrome(num));
	}

	public static int reverse(int num) {
		String line = Integer.toString(num); // convertig from int to string so
												// we can easier get number
												// backwards
		if (line.length() != 3) { // we check if number is 3 digits
			System.out.println("Number you entered doesn't have 3 digits.");
			System.exit(1);
		}
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
