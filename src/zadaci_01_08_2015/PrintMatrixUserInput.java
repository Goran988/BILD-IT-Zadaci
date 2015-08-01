package zadaci_01_08_2015;

import java.util.Scanner;

public class PrintMatrixUserInput {
	/**
	 * Ask user to enter matrix rows and columns than print out the matrix with
	 * values 0 and 1 randomly generated.
	 * 
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter rows and columns for simetric matrix: ");
		int num = input.nextInt();
		printMatrix(num);
	}

	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n]; // creating matrix with users number as
										// number of rows and columns
		for (int i = 0; i < n; i++) { // using nested loop we're accessing
										// elements of the matrix
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 2); // Math.random method
															// assigns elements
															// value 0 or 1
			}
		}
		for (int[] e : matrix) { // we're using enhanced loop to printout
									// elements of matrix
			for (int i : e) {
				System.out.print(i + " ");
			}
			System.out.println(); // every row goes to the new line
		}
	}

}
