package zadaci_08_08_2015;

import java.util.Scanner;

public class MultiplyMatrix {
	/**
	 * Write a method to multiply two matrices. The header of the method is:
	 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] one = new double[3][3];
		double[][] two = new double[3][3];
		System.out.println("Enter values for first 3x3 matrix"); // fill out 3x3
																	// matrix by
																	// taking
																	// numbers
																	// from user
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				one[i][j] = input.nextDouble();
			}
		}
		input.close();

		System.out.println("Enter values for second 3x3 matrix"); // fill out
																	// second
																	// 2x2
																	// matrix by
																	// taking
																	// numbers
																	// from user
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				two[i][j] = input.nextDouble();
			}
		}
		double[][] res = multiplyMatrix(one, two);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%.1f ", res[i][j]); // printing out elements
														// of the result matrix
														// and formating to 1
														// decimal space
			}
			System.out.println();

		}
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		/**
		 * We use 3 loops, and we combine them to go over elements of our
		 * matrixes.(i and j is used to move through result loop, i and k are
		 * used to access indexes of loop a, and k, j are used to access indexes
		 * of loop b.
		 */
		double[][] res = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					res[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return res;

	}
}
