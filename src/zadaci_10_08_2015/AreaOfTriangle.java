package zadaci_10_08_2015;

import java.util.Scanner;

public class AreaOfTriangle {
	/**
	 * Write a method that returns the area of a triangle using the following
	 * header: public static double getTriangleArea(double[][] points) The
	 * points are stored in a 3-by-2 two-dimensional array points with points[0]
	 * [0] and points[0][1] for (x1, y1).
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three point of your triangle:");
		double[][] triangle = new double[3][2]; // we take the points of the
												// triangle from the user and
												// store them to 2D array
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				triangle[i][j] = input.nextDouble();
			}
		}
		if (getTriangleArea(triangle) == 0) { // if area is 0 it means that
												// points of the triangle were
												// on the same line
			System.out.println("Points are on the same line");
		} else { // else we print the area rounded to 2 decimal spaces
			System.out.printf("The area is : %.2f ", getTriangleArea(triangle));
		}
	}

	public static double getTriangleArea(double[][] points) {
		// we use the formula for calculating the area of triangle, with
		// elements of the array as points
		double area = Math.abs((points[0][0] * (points[1][1] - points[2][1])
				+ points[1][0] * (points[2][1] - points[0][1]) + points[2][0]
				* (points[0][1] - points[1][1])) / 2);
		return area;

	}
}
