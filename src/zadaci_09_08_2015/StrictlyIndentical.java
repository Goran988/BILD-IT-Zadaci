package zadaci_09_08_2015;

import java.util.Scanner;

/**
 * The two-dimensional arrays m1 and m2 are strictly identical if their
 * corresponding elements are equal. Write a method that returns true if m1 and
 * m2 are strictly identical, using the following header: public static boolean
 * equals(int[][] m1, int[][] m2) Write a test program that prompts the user to
 * enter two 3 * 3 arrays of integers and displays whether the two are strictly
 * identical.
 *
 */
public class StrictlyIndentical {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values of your first 3x3 matrix:");
		int[][] a = new int[3][3];
		for (int i = 0; i < 3; i++) { // user populates first matrix
			for (int j = 0; j < 3; j++) {
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter values of your second 3x3 matrix:");
		int[][] b = new int[3][3];
		for (int i = 0; i < 3; i++) { // user populates second matrix
			for (int j = 0; j < 3; j++) {
				b[i][j] = input.nextInt();
			}
		}
		if (equals(a, b)) // invoking the method equals(depending on the result
							// we print if the arrays are equal or not)
			System.out.println("The two arrays are strictly identical");
		else
			System.out.println("The two arrays are not strictly identical");
	}

	public static boolean equals(int[][] m1, int[][] m2) {
		// method that check coresponding elements of both matrixes
		if (m1.length != m2.length)
			return false;
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				if (m1[i][j] != m2[i][j]) // first time they're not equal method
											// returns false
					return false;
			}
		}
		return true;

	}
}
