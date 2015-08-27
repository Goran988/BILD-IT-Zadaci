package zadaci_26_08_2015;

import zadaci_25_08_2015.GeometricObject;

/**
 * Write a method that sums the areas of all the geometric objects in an array.
 * The method signature is: public static double sumArea(GeometricObject[] a)
 * Write a test program that creates an array of four objects (two circles and
 * two rectangles) and computes their total area using the sumArea method.
 */
public class SumArea {

	public static void main(String[] args) {
		//circle object with radius 5
		GeometricObject c1 = new Circle(5);
		//circle object with radius 2
		GeometricObject c2 = new Circle(2);
		//rectangle object with sides 2 and 3
		GeometricObject rec1 = new Rectangle(2, 3);
		//rectangle object with sides 3 and 3
		GeometricObject rec2 = new Rectangle(3, 3);
		//creating array list of created objects
		GeometricObject[] a = { c1, c2, rec1, rec2 };
		//printing out the result of method
		System.out.printf("Area of objects is %.2f", sumArea(a));

	}

	/**
	 * method that returns sum of areas of all objects in array list
	 * 
	 * @param a
	 *            - array list of GeometricObject data type
	 * @return - sum of areas as double
	 */
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		//going through the array list and summing up areas
		for (GeometricObject e : a) {
			sum += e.getArea();
		}
		return sum;

	}

}
