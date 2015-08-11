package zadaci_10_08_2015;

import java.util.Arrays;
import java.util.Scanner;

public class LatinSquare {
	/**
	 * A Latin square is an n-by-n array filled with n different Latin letters,
	 * each occurring exactly once in each row and once in each column. Write a
	 * program that prompts the user to enter the number n and the array of
	 * characters, as shown in the sample output, and checks if the input array
	 * is a Latin square. The characters are the first n characters starting
	 * from A.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number n: ");
		int n = input.nextInt();
		char[][] chars = new char[n][n];
		System.out.println("Enter " + n
				+ " rows of letters separated by spaces:");
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // string that we use to see
													// if letter user entered is
													// within allowed range
		for (int i = 0; i < n; i++) { // filling up 2D char array with letters
										// user entered
			for (int j = 0; j < n; j++) {
				chars[i][j] = Character.toUpperCase(input.next().charAt(0)); // if
																				// user
																				// tried
																				// to
																				// enter
																				// letter
																				// beyond
																				// limited
																				// range
																				// we
																				// inform
																				// him
																				// and
																				// stop
																				// the
																				// program
				if (abc.indexOf(chars[i][j]) + 1 > n) {
					System.out
							.println("Wrong input the letters must be from A to "
									+ abc.charAt(n - 1));
					System.exit(1);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!isLatin(chars, chars[i][j])) { // if isLatin "check" goes
													// true for all chars we
													// print out that array is
													// latin square, else we
													// notify the user and stop
													// the program
					System.out.println("The input array is not a Latin square");
					System.exit(1);
				}
			}
		}
		System.out.println("The input array is a Latin square");

	}

	public static boolean isLatin(char[][] a, char ch) {
		// method that checks if the character is repeated in every row and
		// column, if there is only one unique character per row or column
		// method
		// returns true, else method returns false
		for (int i = 0; i < a.length; i++) {
			int countR = 0;
			int countC = 0;
			for (int j = 0; j < a[i].length; j++) {
				if (ch == a[i][j])
					countR++;
				if (countR > 1)
					return false;
				if (ch == a[j][i])
					countC++;
				if (countC > 1)
					return false;

			}
		}
		return true;
	}
}
