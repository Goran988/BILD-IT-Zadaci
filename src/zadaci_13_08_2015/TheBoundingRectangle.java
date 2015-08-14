package zadaci_13_08_2015;

import java.util.Scanner;

/**
 * A bounding rectangle is the minimum rectangle that encloses a set of points
 * in a two-dimensional plane. Write a method that returns a bounding rectangle
 * for a set of points in a two-dimensional plane, as follows: public static
 * MyRectangle2D getRectangle(double[][] points)
 *
 */
public class TheBoundingRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// notify the user to enter 5 points(x and y coordinates)
		System.out.println("Enter five points: ");
		double[][] points = new double[5][2];
		// store users points into 2D array
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		// we assigned return value of getRectangle method to new object
		MyRectangle2D rect = getRectangle(points);
		// printing out the result
		System.out.println("The bounding rectangle center is ("
				+ (rect.getX() + "," + rect.getY()) + "), width "
				+ rect.getWidth() + ", height " + rect.getHeight());
	}

	/**
	 * method that uses minimum and maximum x and y coordinate, and than
	 * calculates smallest rectangle that will include them all.
	 * 
	 * @param points
	 *            - 2D array that has set of coordinates for points rectangle
	 *            must include
	 * @return - object of MyRectangle2D class that
	 */
	public static MyRectangle2D getRectangle(double[][] points) {
		double minX = points[0][0];
		double maxX = 0;
		double minY = points[0][1];
		double maxY = 0;
		//finding maximum and minimum x and y coordinate
		for (int i = 0; i < points.length; i++) {
			if (minX > points[i][0])
				minX = points[i][0];
			if (maxX < points[i][0])
				maxX = points[i][0];
			if (minY > points[i][1])
				minY = points[i][1];
			if (maxY < points[i][1])
				maxY = points[i][1];
		}
		//calculating width of bounding rectangle
		double width = maxX - minX;
		//calculating height of bounding rectangle
		double height = maxY - minY;
		//calculating x coordinate
		double recX = (width / 2) + minX;
		//calculating y coordinate
		double recY = (height / 2) + minY;
		//creating new object with previously calculated values
		MyRectangle2D rec = new MyRectangle2D(recX, recY, width, height);
		return rec;
	}
}
