package zadaci_10_08_2015;

import java.util.Scanner;

public class LinearEquation {
	/**
	 * Write a method that solves the following 2 * 2 system of linear
	 * equations. The method header is public static double[]
	 * linearEquation(double[][] a, double[] b)
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[][] a = new double[2][2];// array for char a
		double[] b = new double[2]; // array for char b

		System.out.print("Enter \"a\" coeficients for both linear equations: ");
		for (int i = 0; i < a.length; i++) { // we use nested loop to fill in 2D
												// array
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = input.nextDouble();
			}
		}
		System.out.print("Enter \"b\" coeficients for both equations: ");
		for (int i = 0; i < b.length; i++) { // entering b parameters
			b[i] = input.nextDouble();
		}

		double[] result = linearEquation(a, b); // array that contains the
												// result
		if (result == null) { // if result is null equations don't have solution
			System.out.println("The equations have no solution.");
		} else { // else we print out solution
			System.out.println("x = " + result[0] + "\ny = " + result[1]);
		}
	}

	public static double[] linearEquation(double[][] a, double[] b) {
		double x;
		double y;
		double divisor = a[0][0] * a[1][1] - a[0][1] * a[1][0];
		if (divisor == 0.0) { // if divisor is 0 equation don't have solution
			return null;
		} else {
			x = (b[0] * a[1][1] - b[1] * a[0][1]) / divisor;
			y = (b[1] * a[0][0] - b[0] * a[1][0]) / divisor;
			double[] xy = { x, y };
			return xy; // returning the result
		}
	}

}
