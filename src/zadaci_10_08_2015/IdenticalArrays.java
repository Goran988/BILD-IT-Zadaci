package zadaci_10_08_2015;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * The two-dimensional arrays m1 and m2 are identical if they have the same
 * contents. Write a method that returns true if m1 and m2 are identical, using
 * the following header: public static boolean equals(int[][] m1, int[][] m2)
 * Write a test program that prompts the user to enter two 3 * 3 arrays of
 * integers and displays whether the two are identical.
 *
 */
public class IdenticalArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values for first 3x3 matrix");
		int[][] a = new int[3][3];		
		for (int i = 0; i < 3; i++) {				//we enter values to first matrix
			for (int j = 0; j < 3; j++) {
				a[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter values for second 3x3 matrix");
		int[][] b = new int[3][3];
		for (int i = 0; i < 3; i++) {				//we enter values for second matrix
			for (int j = 0; j < 3; j++) {
				b[i][j] = input.nextInt();
			}
		}
		if (equals(a, b))							//invoking method and printing out message depending on the result
			System.out.println("The two arrays are identical");
		else {
			System.out.println("The two arrays are not identical");
		}

	}

	public static boolean equals(int[][] m1, int[][] m2) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		for (int i = 0; i < m1.length; i++) {					//we convert 2D arrays into array lists
			for (int j = 0; j < m1[i].length; j++) {
				a.add(m1[i][j]);
				b.add(m2[i][j]);
			}
		}
		Collections.sort(a);									//sorting out both lists and checking if they're equal
		Collections.sort(b);
		if (a.equals(b))										//if sorted arrays are equal method returns true, else it returns false
			return true;
		else
			return false;
	}

}
