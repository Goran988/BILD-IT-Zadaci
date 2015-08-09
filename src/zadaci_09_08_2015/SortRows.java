package zadaci_09_08_2015;

import java.util.Arrays;
import java.util.Scanner;

public class SortRows {
	/**
	 * (Row sorting) Implement the following method to sort the rows in a
	 * twodimensional array. A new array is returned and the original array is
	 * intact. public static double[][] sortRows(double[][] m) Write a test
	 * program that prompts the user to enter a 3 * 3 matrix of double values
	 * and displays a new row-sorted matrix.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values for your 3X3 matrix:");
		double[][] nums = new double[3][3];
		for (int i = 0; i < 3; i++) {						//user enters values for 3X3 matrix
			for (int j = 0; j < 3; j++) {
				nums[i][j] = input.nextDouble();
			}
		}
		double[][] result = sortRows(nums);
		System.out.println("The new sorted matrix is:");
		for (double[] e : result) {						//printing out the new sorted matrix
			for (double i : e) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

	public static double[][] sortRows(double[][] m) {
		//method that goes through the matrix and sorts every row
		for (int i = 0; i < m.length; i++) {			
			Arrays.sort(m[i]);
		}
		return m;				//we return matrix with sorted rows

	}

}
