package zadaci_13_08_2015;



/**
 * Two double data fields named x and y that specify the center of the circle
 * with getter methods. 
 * A data field radius with a getter method. A no-arg
 * constructor that creates a default circle with (0, 0) for (x, y) and 1 for
 * radius. 
 * A constructor that creates a circle with the specified x, y, and
 * radius. 
 * A method getArea() that returns the area of the circle. 
 * A method getPerimeter() that returns the perimeter of the circle.
 *
 */
public class Circle2D {
	private double x;
	private double y;
	private double radius;

	/**
	 * default constructor that creates Circle2D object with default data field
	 * values.
	 */
	Circle2D() {
		x = 0;
		y = 0;
		radius = 1;

	}

	/**
	 * constructor that creates Circle2D object with data field values user
	 * entered
	 * 
	 * @param x
	 *            coordinate of the center of the circle
	 * @param y
	 *            coordinate of the center of the circle
	 * @param radius
	 *            radius of the circle
	 */
	Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/**
	 * method that returns value of x
	 * 
	 * @return returns value of x
	 */
	public double getX() {
		return x;
	}

	/**
	 * method that returns value of y
	 * 
	 * @return returns value of y
	 */
	public double getY() {
		return y;
	}

	/**
	 * method that returns value of radius
	 * 
	 * @return returns value of radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * method that calculates value of area for circle
	 * 
	 * @return returns value of area
	 */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/**
	 * method that calculates value of perimeter for circle
	 * 
	 * @return returns value of perimeter
	 */
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	/**
	 * method that checks if the point that is passed is contained by the circle
	 * 
	 * @param x
	 *            coordinate of the point passed
	 * @param y
	 *            coordinate of the point passed
	 * @return returns true if point is within the circle and false if it's not
	 */
	public boolean contains(double x, double y) {
		if (distance(x, y) > radius)
			return false;
		else
			return true;

	}

	/**
	 * method that checks if object contains the Circle2D object that is passed
	 * to the method
	 * 
	 * @param c
	 *            object of the Circle2D class that is passed to the method
	 * @return
	 */
	public boolean contains(Circle2D c) {
		if (this.radius < distance(c.getX(), c.getY()) + c.getRadius())
			return false;
		else
			return true;
	}

	/**
	 * method that checks if object overlaps with object that is passed to the
	 * method
	 * 
	 * @param c
	 *            object of the Circle2D class that is passed to the method
	 * @return returns true if they overlap and false if they don't
	 */
	public boolean overlaps(Circle2D c) {
		if ((this.radius + c.getRadius()) >= distance(c.getX(), c.getY())
				&& Math.abs((radius - c.radius)) <= distance(c.getX(), c.getY()))
			return true;
		else
			return false;

	}

	/**
	 * method that calculate distance from one point(center of the circle) to
	 * another(center of the circle)
	 * 
	 * @param x
	 *            coordinate of the center
	 * @param y
	 *            coordinate of the center
	 * @return returns distance between centers
	 */
	public double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y)
				* (this.y - y));
	}

}
