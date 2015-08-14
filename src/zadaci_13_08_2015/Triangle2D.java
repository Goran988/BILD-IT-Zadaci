package zadaci_13_08_2015;

import java.awt.geom.Line2D;
/**
 * Define the Triangle2D class that contains:
 * Three points named p1, p2, and p3 of the type MyPoint with getter and
 * setter methods.
 * A no-arg constructor that creates a default triangle with the points (0, 0), (1,
 * 1), and (2, 5).
 * A constructor that creates a triangle with the specified points.
 * A method getArea() that returns the area of the triangle.
 * A method getPerimeter() that returns the perimeter of the triangle.
 * A method contains(MyPoint p) that returns true if the specified point
 * p is inside this triangle.
 * A method contains(Triangle2D t) that returns true if the specified
 * triangle is inside this triangle (see Figure 10.22b).
 * A method overlaps(Triangle2D t) that returns true if the specified
 * triangle overlaps with this triangle.
 */
import zadaci_12_08_2015.MyPoint;

public class Triangle2D {
	private MyPoint p1;
	private MyPoint p2;
	private MyPoint p3;

	/**
	 * default constructor that creates triangle with predefined points
	 */
	Triangle2D() {
		p1 = new MyPoint(0, 0);
		p2 = new MyPoint(1, 1);
		p3 = new MyPoint(2, 5);
	}

	/**
	 * constructor which creates object with user based points
	 * 
	 * @param p1
	 *            - first point of triangle
	 * 
	 * @param p2
	 *            - second point of triangle
	 * @param p3
	 *            - third point of triangle
	 */
	Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	// get method for point 1
	public MyPoint getP1() {
		return p1;
	}

	// set method for point 1
	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	// get method for point 2
	public MyPoint getP2() {
		return p2;
	}

	// set method for point 2
	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	// get method for point 3
	public MyPoint getP3() {
		return p3;
	}

	// set method for point 3
	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}

	/**
	 * method that calculates area of triangle, it sums up sides by calculating
	 * distance between points of the triangle and uses mathematical formula to
	 * calculate area.
	 * 
	 * @return - area of triangle object
	 */
	public double getArea() {
		double side1 = p1.distance(p2);

		double side2 = p1.distance(p3);

		double side3 = p2.distance(p3);

		double sum = (side1 + side2 + side3) / 2;

		double area = Math.sqrt(sum
				* ((sum - side1) * (sum - side2) * (sum - side3)));

		return area;

	}

	/**
	 * method that calculates perimeter by adding all 3 sides of triangle
	 * 
	 * @return - double value of perimeter
	 */
	public double getPerimeter() {

		double side1 = p1.distance(p2);
		double side2 = p1.distance(p3);
		double side3 = p2.distance(p3);
		double perimeter = (side1 + side2 + side3);
		return perimeter;

	}

	/**
	 * method that checks if triangle contains the point
	 * 
	 * @param p
	 *            - point we pass to the method
	 * @return - returns true if triangle contains the dot and false if it
	 *         doesn't
	 */
	public boolean contains(MyPoint p) {
		// method is based on logic that if point is in the triangle, sum of
		// areas of
		// "mini-triangles" which are formed by 2 points of the triangle and the
		// point we're checking is equal to the area of the triangle
		double side1, side2, side3, s, areaPAB, areaPBC, areaPCA, areaABC;

		// calculate area of PAB
		side1 = p1.distance(p);
		side2 = p1.distance(p2);
		side3 = p2.distance(p);
		s = (side1 + side2 + side3) / 2;
		areaPAB = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		// calculate area of PBC
		side1 = p2.distance(p);
		side2 = p2.distance(p3);
		side3 = p3.distance(p);
		s = (side1 + side2 + side3) / 2;
		areaPBC = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		// calculate area of PCA
		side1 = p1.distance(p);
		side2 = p1.distance(p3);
		side3 = p3.distance(p);
		s = (side1 + side2 + side3) / 2;
		areaPCA = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		// calculate area of ABC
		side1 = p1.distance(p2);
		side2 = p2.distance(p3);
		side3 = p3.distance(p1);
		s = (side1 + side2 + side3) / 2;
		areaABC = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		// if areaPab + areaPBC + areaPCA = areaABC, then p is in the ABC(since
		// we're dealing with doubles it result of deduction wouldn't be round
		// number)
		if (Math.abs((areaPAB + areaPBC + areaPCA) - areaABC) <= 0.5)
			return true;
		else
			return false;
	}

	/**
	 * method that checks if the first triangle contains the triangle passed to
	 * method
	 * 
	 * @param input
	 *            - triangle object passed to method
	 * @return - returns true if triangle is contained and false if it's not
	 */
	public boolean contains(Triangle2D input) {
		// method checks if all the points of the triangle passed to method are
		// contained in first triangle
		return (this.contains(input.getP1()) && this.contains(input.getP2()) && this
				.contains(input.getP3()));
	}

	/**
	 * method that checks if two triangles overlap
	 * 
	 * @param t
	 *            - triangle object passed to the method
	 * @return - returns true if two triangles overlap and false if they don't
	 */
	public boolean overlaps(Triangle2D t) {
		// we create line2D object by using the coordinates of points of
		// triangles, we create 3 sides of "first" triangle and 3 sides of
		// triangle we pass to method
		Line2D l1 = new Line2D.Double(this.p1.getX(), this.p1.getY(),
				this.p2.getX(), this.p2.getY());
		Line2D l2 = new Line2D.Double(this.p1.getX(), this.p1.getY(),
				this.p3.getX(), this.p3.getY());
		Line2D l3 = new Line2D.Double(this.p2.getX(), this.p2.getY(),
				this.p3.getX(), this.p3.getY());
		Line2D tL1 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p2.getX(),
				t.p2.getY());
		Line2D tL2 = new Line2D.Double(t.p1.getX(), t.p1.getY(), t.p3.getX(),
				t.p3.getY());
		Line2D tL3 = new Line2D.Double(t.p2.getX(), t.p2.getY(), t.p3.getX(),
				t.p3.getY());
		// through series of if conditions we check if there is intersection of
		if (l1.intersectsLine(tL1) || l1.intersectsLine(tL2)
				|| l1.intersectsLine(tL3) || l2.intersectsLine(tL1)
				|| l2.intersectsLine(tL2) || l2.intersectsLine(tL3)
				|| l3.intersectsLine(tL1) || l3.intersectsLine(tL2)
				|| l3.intersectsLine(tL3))
			return true;

		return false;

	}

}
