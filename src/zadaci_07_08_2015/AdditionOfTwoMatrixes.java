package zadaci_07_08_2015;

import java.util.Scanner;

import javafx.scene.transform.MatrixType;

public class AdditionOfTwoMatrixes {
	/**
	 * Write a program that adds two matrixes.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] matrixOne = new double[3][3];
		double[][] matrixTwo = new double[3][3];
		System.out.println("Enter your first 3x3 matrix:");		//setting elements for first matrix
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrixOne[i][j] = input.nextDouble();
			}
		}
		System.out.println("Enter your second 3x3 matrix:");	//setting elements for second matrix
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrixTwo[i][j] = input.nextDouble();
			}
		}
		addMatrixes(matrixOne, matrixTwo);						//passing both matrixes to the method

	}

	public static void addMatrixes(double[][] a, double[][] b) {
		double[][] result = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result[i][j] = a[i][j] + b[i][j];				//adding elements from first matrix to coresponding elements of the second
				System.out.print(result[i][j] + " ");			//printing out the result in the proces
			}
			System.out.println();								//new row of the matrix goes to new line
		}
	}

}
