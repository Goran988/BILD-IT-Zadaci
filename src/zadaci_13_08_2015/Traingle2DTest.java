package zadaci_13_08_2015;

import zadaci_12_08_2015.MyPoint;

public class Traingle2DTest {

	public static void main(String[] args) {
		// object of Triangle2D class with user specified points
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2),
				new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		// area of the triangle
		System.out.println("Area of the triangle is: " + t1.getArea());
		// perimeter of the triangle
		System.out
				.println("Perimeter of the triangle is: " + t1.getPerimeter());
		// test if triangle contains the point
		System.out.println(t1.contains(new MyPoint(3, 3)));
		// test if triangle contains other triangle
		System.out.println("Trianlge contains new triangle? "
				+ t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(
						4, 1), new MyPoint(1, 3.4))));
		// test if the triangle overlaps with other triangle
		System.out.println("Triangle overlaps with new triangle?"
				+ t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(
						4, -3), new MyPoint(2, 6.5))));
	}
}
