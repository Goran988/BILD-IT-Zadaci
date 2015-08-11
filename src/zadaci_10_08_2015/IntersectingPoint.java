package zadaci_10_08_2015;

import java.util.Scanner;

/**
 * Write a method that returns the intersecting point of two lines. The method
 * header is public static double[] getIntersectingPoint(double[][] points) The
 * points are stored in a 4-by-2 two-dimensional array points with
 * (points[0][0], points[0][1]) for (x1, y1). The method returns the
 * intersecting point or null if the two lines are parallel. Write a program
 * that prompts the user to enter four points and displays the intersecting
 * point.
 *
 */
public class IntersectingPoint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] points = new double[4][2];

		System.out
				.print("Enter coordinates for points on the line x1, y1, x2, y2, x3, y3, x4, y4: ");
		for (int i = 0; i < points.length; i++) { // adding dots user entered to
													// 2D array
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		double[] inersectingPoint = getIntersectingPoint(points); // assigning
																	// value of
																	// method
																	// result to
																	// variable
																	// intersectingPoint

		if (inersectingPoint == null) { // if result is null lines are parallel
			System.out.println("The lines are parallel.");
		} else { // else we print coordinates of intersecting points
			System.out.printf("Intersecting point is at: (%.4f,%.4f)",
					inersectingPoint[0], inersectingPoint[1]);
		}

	}

	public static double[] getIntersectingPoint(double[][] points) {
		// method that solves the linear equation who's result is intersecting
		// point
		double c1 = (points[0][1] - points[1][1]) * points[0][0] // c1 = (y1 -
																	// y2)x1 -
																	// (x1 -
																	// x2)y1
				- (points[0][0] - points[1][0]) * points[0][1];

		double c2 = (points[2][1] - points[3][1]) * points[2][0] // c2 = (y3 -
																	// y4)x3 -
																	// (x3 -
																	// x4)y3
				- (points[2][0] - points[3][0]) * points[2][1];

		double a1 = points[0][1] - points[1][1]; // a1 = (y1 - y2)

		double b1 = points[0][0] - points[1][0]; // b1 = (x1 - x2)

		double a2 = points[2][1] - points[3][1]; // a2 = (y3 - y4)

		double b2 = points[2][0] - points[3][0]; // b2 = (x3 - x4)

		double divisor = a1 * b2 - b1 * a2; // formula to calculate divisor

		if (divisor != 0) {
			double x = (c1 * b2 - c2 * b1) / divisor; // intersecting coordinate
														// x

			double y = (c2 * a1 - c1 * a2) / divisor; // intersecting coordinate
														// y

			double[] res = { x, y }; // result is array with coordinates

			return res;
		}

		else { // if divisor is null lines are paralel
			return null;
		}

	}

}
