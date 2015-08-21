package zadaci_20_08_2015;

import java.util.Scanner;
import javafx.geometry.Point2D;

/**
 * polygon is convex if it contains any line segments that connects two points
 * of the polygon. Write a program that prompts the user to enter the number of
 * points in a convex polygon, then enter the points clockwise, and display the
 * area of the polygon.
 */
public class ConvexPolygon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// asking user for number of points
		System.out.println("Enter number of points:");
		// array of Point2D object which will be used to store coordinates
		Point2D[] poly = new Point2D[input.nextInt()];
		System.out.println("Enter coordinates for your points (clockwise):");
		// storing coordinates in the array
		for (int i = poly.length - 1; i >= 0; i--) {
			poly[i] = new Point2D(input.nextDouble(), input.nextDouble());
		}
		// printing out the result
		System.out.println(area(poly));
	}

	/**
	 * method that calculate area of polygon based on array of Point2D objects
	 * 
	 * @param polyPoints
	 *            - array of coordinates
	 * @return - value of area as a double
	 */
	public static double area(Point2D[] polyPoints) {
		int i, j, n = polyPoints.length;
		double area = 0;
		// algorithm for calculating area of any polygon
		for (i = 0; i < n; i++) {
			j = (i + 1) % n;
			area += polyPoints[i].getX() * polyPoints[j].getY();
			area -= polyPoints[j].getX() * polyPoints[i].getY();
		}
		area /= 2.0;
		return area;
	}

}
